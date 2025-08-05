package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.search.common.util.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nuj implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String NAMESPACE = "search_template_preload";

    /* renamed from: a  reason: collision with root package name */
    private final nuh f31772a = new nui();
    private String b = "";
    private final float c = Float.parseFloat(noa.SERVER_VERSION_VALUE);
    private final HashMap<String, nuk> d = new HashMap<>();

    static {
        kge.a(471975680);
        kge.a(-1209827241);
        Companion = new a(null);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> args) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, args});
            return;
        }
        q.c(args, "args");
        long currentTimeMillis = System.currentTimeMillis();
        if (!r.cc()) {
            OrangeConfig.getInstance().unregisterListener(new String[]{NAMESPACE}, this);
            return;
        }
        String str2 = args.get("configVersion");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        k.d("TemplatePreLoaderListener", "receive config, currentVersion:" + this.b + ", newVersion:" + str2, new Object[0]);
        if (!q.a((Object) this.b, (Object) str2)) {
            if (str2 == null) {
                q.a();
            }
            this.b = str2;
            a();
        }
        k.d("TemplatePreLoaderListener", "handle preload on " + Thread.currentThread() + ", cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms", new Object[0]);
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k.d("TemplatePreLoaderListener", "trigger preload", new Object[0]);
        JSONArray parseArray = JSON.parseArray(OrangeConfig.getInstance().getCustomConfig(NAMESPACE, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264));
        ArrayList arrayList = new ArrayList();
        int size = parseArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = parseArray.getJSONObject(i);
            String string = jSONObject.getString(BizContext.KEY_SDK_VERSION);
            q.a((Object) string, "config.getString(\"sv\")");
            if (Float.parseFloat(string) <= this.c) {
                String url = jSONObject.getString("url");
                String md5 = jSONObject.getString("md5");
                String name = jSONObject.getString("name");
                if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(md5) && !TextUtils.isEmpty(name)) {
                    nuk nukVar = this.d.get(name);
                    if (nukVar != null && q.a((Object) nukVar.a(), (Object) url)) {
                        k.d("TemplatePreLoaderListener", "模板" + name + "未发生变化，不触发预加载", new Object[0]);
                    } else {
                        q.a((Object) url, "url");
                        q.a((Object) md5, "md5");
                        q.a((Object) name, "name");
                        nuk nukVar2 = new nuk(url, md5, name);
                        this.d.put(nukVar2.c(), nukVar2);
                        arrayList.add(nukVar2);
                    }
                }
            }
        }
        this.f31772a.a(arrayList);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1801777736);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
