package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;

/* loaded from: classes8.dex */
public class ntj implements com.taobao.android.searchbaseframe.business.srp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1634983915);
            kge.a(1316253846);
        }

        @Override // com.taobao.android.searchbaseframe.datasource.b
        public void a(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3136b669", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, aVar});
            }
        }

        @Override // com.taobao.android.searchbaseframe.datasource.b
        public void a(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92aa8405", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, aVar});
            }
        }
    }

    static {
        kge.a(-424384947);
        kge.a(619110577);
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.a
    public b a(com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> aVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5bba1878", new Object[]{this, aVar, iruVar}) : new a();
    }
}
