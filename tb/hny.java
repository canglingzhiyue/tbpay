package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.searchbar.data.a;
import com.taobao.search.searchdoor.searchbar.data.b;
import com.taobao.search.searchdoor.searchbar.data.c;
import com.taobao.search.searchdoor.searchbar.data.d;

/* loaded from: classes7.dex */
public class hny {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1137643315);
    }

    public static hme<?> a(a aVar, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hme) ipChange.ipc$dispatch("4bb5b81e", new Object[]{aVar, new Boolean(z), context});
        }
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            if (StringUtils.isEmpty(cVar.a())) {
                return null;
            }
            return new hmw(cVar, z);
        } else if (aVar instanceof b) {
            return new hmh((b) aVar, z, context);
        } else {
            if (!(aVar instanceof d)) {
                return null;
            }
            return new hmr((d) aVar, z, context);
        }
    }
}
