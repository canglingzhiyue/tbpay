package tb;

import android.support.v4.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public interface cem {

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-887060650);
        }

        public static ShopStandardFragment a(cem cemVar, cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopStandardFragment) ipChange.ipc$dispatch("bc7224c6", new Object[]{cemVar, celVar});
            }
            q.d(cemVar, "this");
            ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
            shopStandardFragment.setFragmentViewProvider(celVar);
            return shopStandardFragment;
        }
    }

    int a();

    Fragment a(int i);
}
