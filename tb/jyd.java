package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.android.xsearchplugin.jarvis.utils.b;
import com.taobao.search.musie.k;
import java.util.Map;

/* loaded from: classes6.dex */
public class jyd extends jyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2046385691);
    }

    public static /* synthetic */ Object ipc$super(jyd jydVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jyf, tb.jye
    public void a(jxs jxsVar, jxw jxwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccea1ba", new Object[]{this, jxsVar, jxwVar});
        } else if (!a(jxsVar).d()) {
        } else {
            h.a(jxsVar.e(), "itemClick", "", jxwVar.f29857a, b.a(jxwVar.b));
        }
    }

    @Override // tb.jyf, tb.jye
    public void a(jxs jxsVar, jxy jxyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccf8a78", new Object[]{this, jxsVar, jxyVar});
        } else if (!a(jxsVar).c()) {
        } else {
            h.a(jxsVar.e(), k.ACTION_LIST_SCROLL, 0, jxyVar.f29859a, new String[0]);
        }
    }

    @Override // tb.jyf, tb.jye
    public void b(jxs jxsVar, jxy jxyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59687ff9", new Object[]{this, jxsVar, jxyVar});
        } else if (!a(jxsVar).c()) {
        } else {
            h.b(jxsVar.e(), k.ACTION_LIST_SCROLL, 0, jxyVar.f29859a, new String[0]);
        }
    }

    @Override // tb.jyf, tb.jye
    public void a(jxs jxsVar, jxv jxvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cce2d5b", new Object[]{this, jxsVar, jxvVar});
        } else if (!a(jxsVar).b()) {
        } else {
            a(jxsVar, jxvVar.f29856a, jxvVar.c, jxvVar.b);
        }
    }

    @Override // tb.jyf, tb.jye
    public void a(jxs jxsVar, jxx jxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccf1619", new Object[]{this, jxsVar, jxxVar});
        } else if (!a(jxsVar).b()) {
        } else {
            String a2 = b.a(jxxVar.f29858a, jxsVar.getCore());
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            h.b(jxsVar.e(), "itemExpose", a2, (View) null, new String[0]);
        }
    }

    private void a(jxs jxsVar, BaseTypedBean baseTypedBean, Map<String, String> map, int i) {
        Map<String, Object> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebdc8ea", new Object[]{this, jxsVar, baseTypedBean, map, new Integer(i)});
            return;
        }
        String a2 = b.a(baseTypedBean, jxsVar.getCore());
        if (TextUtils.isEmpty(a2) || (b = b.b(baseTypedBean, jxsVar.getCore())) == null) {
            return;
        }
        if (map != null) {
            b.putAll(map);
        }
        b.put(JarvisConstant.KEY_JARVIS_INDEX, String.valueOf(i));
        h.a(jxsVar.e(), "itemExpose", a2, (View) null, b.a(b));
    }

    private jxp a(jxs jxsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jxp) ipChange.ipc$dispatch("3b4d06b1", new Object[]{this, jxsVar}) : (jxp) jxsVar.getCore().c().g();
    }
}
