package webelements.types;

import com.google.inject.ImplementedBy;

@ImplementedBy(MyInputImpl.class)
public interface MyInput {

    void type(String text);
    void typeAndEnter(String text);
    MyInput removeText();
    String typeRandomText();
}
