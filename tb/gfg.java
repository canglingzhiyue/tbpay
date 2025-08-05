package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.image.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class gfg implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<DXWidgetNode> f28307a;

    static {
        kge.a(891719589);
        kge.a(-1390502639);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties().b() != null) {
        } else {
            fxe.e(new gfg(new WeakReference(dXWidgetNode)));
        }
    }

    public static void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{dXWidgetNode});
        } else {
            new gfg(new WeakReference(dXWidgetNode)).run();
        }
    }

    public gfg(WeakReference<DXWidgetNode> weakReference) {
        this.f28307a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        DXTemplateItem c;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            DXWidgetNode dXWidgetNode = this.f28307a.get();
            if (dXWidgetNode == null || (c = dXWidgetNode.getDXRuntimeContext().c()) == null || c.g == null) {
                return;
            }
            String substring = c.g.f11934a.substring(0, c.g.f11934a.length() - 7);
            if (TextUtils.isEmpty(substring)) {
                return;
            }
            String str = substring + "logic";
            String str2 = str + "/config.json";
            if (!new File(str2).exists() || (b = fwn.a().b(str2, dXWidgetNode.getDXRuntimeContext())) == null) {
                return;
            }
            JSONArray jSONArray = b.getJSONArray(c.MODULES);
            String string = b.getString("type");
            fuw.a(str);
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    linkedList.add(new Pair<>((String) obj, fwn.a().a(str + fxb.DIR + obj + "." + string, dXWidgetNode.getDXRuntimeContext())));
                }
            }
            dXWidgetNode.getDxv4Properties().a(linkedList);
        } catch (Throwable th) {
            a.b(th);
        }
    }
}
