package eu.faircode.xlua.randomizers.elements;

import androidx.annotation.NonNull;

import java.util.List;

import eu.faircode.xlua.randomizers.IRandomizer;

public class DataStateElement implements ISpinnerElement {
    public static DataStateElement create(String name, Integer value) { return new DataStateElement(name, value); }

    private String displayName;
    private Integer value;

    public DataStateElement() { }
    public DataStateElement(String name, Integer value) {
        this.displayName = name;
        this.value = value;
    }

    @Override
    public String getName() { return this.displayName; }

    @Override
    public String getValue() { return Integer.toString(this.value); }

    @Override
    public boolean isSetting(String settingName) { return false; }

    @Override
    public String getSettingName() { return Integer.toString(this.displayName.hashCode()); }

    @Override
    public String getID() { return Integer.toString(this.value); }

    @Override
    public String generateString() { return Integer.toString(this.value); }

    @Override
    public int generateInteger() { return this.value; }

    @Override
    public List<ISpinnerElement> getOptions() {
        return null;
    }

    @NonNull
    @Override
    public String toString() { return this.displayName; }
}