    package psdi.app.asset;

import java.rmi.RemoteException;
import psdi.mbo.MAXTableDomain;
import psdi.mbo.MboValue;

public class FldAssetTag extends MAXTableDomain {
   public FldAssetTag(MboValue mbv) throws RemoteException {
      super(mbv);
      this.setRelationship("ASSET", "1=1");
      this.setListCriteria("assettag is not null");
      String[] target = new String[]{"assettag"};
      String[] source = new String[]{"assettag"};
      this.setLookupKeyMapInOrder(target, source);
   }
}
