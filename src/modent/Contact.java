package modent;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String numberPhone;
    private Type type;

    public Contact() {
    }

    public Contact(String name, String numberPhone, Type type) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", type=" + type +
                '}';
    }
    public static class Type implements Serializable {
        private int id;
        private String name;

        public Type() {
        }

        public Type(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }


    }
}