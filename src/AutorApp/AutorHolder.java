package AutorApp;

/**
* AutorApp/AutorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Autor.idl
* mi�rcoles 8 de mayo de 2019 08:57:40 PM COT
*/

public final class AutorHolder implements org.omg.CORBA.portable.Streamable
{
  public AutorApp.Autor value = null;

  public AutorHolder ()
  {
  }

  public AutorHolder (AutorApp.Autor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AutorApp.AutorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AutorApp.AutorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AutorApp.AutorHelper.type ();
  }

}
