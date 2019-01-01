package basics.Equal;

class EqualObject {
    private int id;
    private String name;
    public EqualObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        EqualObject tmp = (EqualObject) obj;
        if (this.getId() == tmp.getId() && this.getName() == tmp.getName()) {
            return true;
        }
        return false;
    }
}

public class Equal {
    public static void main(String[] args) {
        EqualObject equalObject = new EqualObject(1, "test");
        EqualObject equalObject1 = equalObject;
        System.out.println(equalObject.equals(equalObject1));
        System.out.println(equalObject.getClass());
        String string = new String("lala");
        System.out.println(string.hashCode());
    }
}
