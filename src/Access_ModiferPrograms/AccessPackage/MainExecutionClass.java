package Access_ModiferPrograms.AccessPackage;

import Access_ModiferPrograms.Default_Acess_Modifire;
import Access_ModiferPrograms.Private_access_Modifire;
import Access_ModiferPrograms.ProtectedAccessModifire;
import Access_ModiferPrograms.Public_access_Modifire;

import java.security.ProtectionDomain;

public class MainExecutionClass extends ProtectedAccessModifire {



    protected void Protected()
    {
        System.out.println("Proteced");
    }

    public static void main(String[] args) {

        Public_access_Modifire obj = new Public_access_Modifire();

        obj.AccessMeEverywhere();
        String print = obj.AccessEveryvariables;
        System.out.println(print);

        Private_access_Modifire obj2 = new Private_access_Modifire();
     //   obj.DontAccess(); // here we can not use private methods,variables in other class

        Default_Acess_Modifire obj3 = new Default_Acess_Modifire();
     //   obj3.IamDefault(); //here we can not use default methods,variables in other package


        MainExecutionClass obj4 = new MainExecutionClass();
     //   obj4.IamProtected(); // here we can not use protected method or variables directly, but we can use
     //   it vai inheritances
        obj4.IamProtected();



    }

}
