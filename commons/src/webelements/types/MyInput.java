package webelements.types;

import com.google.inject.ImplementedBy;

@ImplementedBy(MyInputImpl.class)
public interface MyInput extends MyElement {

    void type(String text);
    void typeAndEnter(String text);
    MyInput removeText();
    String typeRandomText();
    String getText();
}
