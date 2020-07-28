package com.github.yeriomin.dumbphoneassistant;

import android.telephony.PhoneNumberUtils;

public class Contact implements Comparable<Contact> {

    public String id;
    public String name;
    public String number;
    public String label;

    protected Contact(String id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    protected Contact(String id, String name, String number, String label) {
        this(id, name, number);
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Contact)) {
            return false;
        }
        return PhoneNumberUtils.compare(number, ((Contact) o).number);
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }
}
