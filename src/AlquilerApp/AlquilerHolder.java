package AlquilerApp;

/**
* AlquilerApp/AlquilerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from alquilerApp.idl
* jueves 9 de mayo de 2019 11:31:33 PM COT
*/

public final class AlquilerHolder implements org.omg.CORBA.portable.Streamable
{
  public AlquilerApp.Alquiler value = null;

  public AlquilerHolder ()
  {
  }

  public AlquilerHolder (AlquilerApp.Alquiler initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlquilerApp.AlquilerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlquilerApp.AlquilerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlquilerApp.AlquilerHelper.type ();
  }

}