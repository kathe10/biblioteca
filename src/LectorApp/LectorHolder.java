package LectorApp;

/**
* LectorApp/LectorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LectorApp.idl
* jueves 9 de mayo de 2019 10:51:39 PM COT
*/

public final class LectorHolder implements org.omg.CORBA.portable.Streamable
{
  public LectorApp.Lector value = null;

  public LectorHolder ()
  {
  }

  public LectorHolder (LectorApp.Lector initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LectorApp.LectorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LectorApp.LectorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LectorApp.LectorHelper.type ();
  }

}
