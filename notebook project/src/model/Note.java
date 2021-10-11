package model;

public class Note {
    private int id;
    private int number;
    private String name;
    private String surName;

    public Note(int id, int number, String name, String surName) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.surName = surName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String number) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Note note = (Note) obj;
        return  note.id == id
                && note.number == number
                && (note.name == name || (name != null && name.equals(note.getName())))
                && (note.surName == surName || (surName != null && surName.equals(note.getSurName())));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result + number;
        result = prime * result + ((surName == null) ? 0 : surName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Note [id = " + id
                + ", number = " + number
                + ", name = " + name
                + ", surname = " + surName + "]";
    }
}
