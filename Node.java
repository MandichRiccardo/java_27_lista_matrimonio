public class Node{
    protected Invitato value;
    protected Node next;

    public Node(Invitato value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
        this.value = new Invitato();
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getLastNode(){
        if(next == null) return this;
        else return next.getLastNode();
    }

    @Override
    public String toString() {
        String info ="";
        info += "\t\tinvitato:\n" + value + "\n";
        if(next != null) info += "\tsuccessivo:\n" + next;
        else info += "\tlista terminata\n";
        return info;
    }

    public boolean equals(Node n){
        return this.value.equals(n.value);
    }

    public int compareTo(Node i){
        String a = this.toString();
        String b = i.toString();
        return a.compareTo(b);
    }

    public boolean invitedByBridegroom(){
        return value.invitedByBridegroom();
    }
}
