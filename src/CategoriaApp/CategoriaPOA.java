package CategoriaApp;


/**
* CategoriaApp/CategoriaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CategoriaApp.idl
* jueves 9 de mayo de 2019 10:06:39 PM COT
*/

public abstract class CategoriaPOA extends org.omg.PortableServer.Servant
 implements CategoriaApp.CategoriaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarCategoria", new java.lang.Integer (0));
    _methods.put ("actualizarCategoria", new java.lang.Integer (1));
    _methods.put ("eliminarCategoria", new java.lang.Integer (2));
    _methods.put ("shutdown", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CategoriaApp/Categoria/insertarCategoria
       {
         int id_categoria = in.read_long ();
         String ca_categoria = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarCategoria (id_categoria, ca_categoria);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // CategoriaApp/Categoria/actualizarCategoria
       {
         int id_categoria = in.read_long ();
         String ca_categoria = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarCategoria (id_categoria, ca_categoria);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // CategoriaApp/Categoria/eliminarCategoria
       {
         int id_categoria = in.read_long ();
         String ca_categoria = in.read_wstring ();
         boolean $result = false;
         $result = this.eliminarCategoria (id_categoria, ca_categoria);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // CategoriaApp/Categoria/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CategoriaApp/Categoria:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Categoria _this() 
  {
    return CategoriaHelper.narrow(
    super._this_object());
  }

  public Categoria _this(org.omg.CORBA.ORB orb) 
  {
    return CategoriaHelper.narrow(
    super._this_object(orb));
  }


} // class CategoriaPOA