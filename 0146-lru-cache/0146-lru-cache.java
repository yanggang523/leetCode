// import java.util.LinkedList;
class LRUCache {
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private HashMap<Integer, Node> cacheMap;
    private int capacity;
    private Node node;
    private Node head;
    private Node tail;


    // 이것을 구현...
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    // key가 존재하면 값 반환, 없으면 -1 반환
    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node node = cacheMap.get(key);
        toFirst(node);
        return node.value;
    }
    
    // 값을 넣기 
    public void put(int key, int value) {
        if (cacheMap.containsKey(key)){ // 이미 있는 경우
            Node node = cacheMap.get(key);
            node.value = value;
            toFirst(node);
        }else{
            if (cacheMap.size() >= capacity){
                cheOldNode(node);
            }
            Node newNode = new Node(key, value);
            cacheMap.put(key, newNode);
            push2First(newNode);
        }
    }

    public void toFirst(Node node){ // 기존 노드 위치에서 삭제하고 이동
        delNode(node);
        push2First(node);
    }
    public void push2First(Node node){ // 노드 앞으로 이동 
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void delNode(Node node){ // 원래 위치에서 노드 삭제
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void cheOldNode(Node node){ // 오래된 노드 삭제 (Map에서도)
        cacheMap.remove(tail.prev.key);
        delNode(tail.prev);
    }

}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */