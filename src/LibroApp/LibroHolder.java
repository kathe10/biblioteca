package LibroApp;

/**
* LibroApp/LibroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LibroApp.idl
* jueves 9 de mayo de 2019 11:09:42 PM COT
*/

public final class LibroHolder implements org.omg.CORBA.portable.Streamable
{
  public LibroApp.Libro value = null;

  public LibroHolder ()
  {
  }

  public LibroHolder (LibroApp.Libro initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LibroApp.LibroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LibroApp.LibroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LibroApp.LibroHelper.type ();
  }

}