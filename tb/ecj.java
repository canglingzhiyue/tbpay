package tb;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.engine.template.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.b;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.RuleModel;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ecj extends AsyncTask<Void, Void, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27192a;

    static {
        kge.a(1322236711);
    }

    public static /* synthetic */ Object ipc$super(ecj ecjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Void doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    public ecj(Context context) {
        this.f27192a = context;
        emu.a("com.taobao.android.detail.core.detail.utils.AsyncTaskOptimize");
    }

    public Void a(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
        }
        try {
            f.a(this.f27192a);
            new d(this.f27192a, "detail2").b();
        } catch (Throwable th) {
            i.a("detailLauncher", "detail 2.0 preLoad", th);
        }
        ear.c();
        a(this.f27192a);
        return null;
    }

    public void a(Context context) {
        DinamicTemplate a2;
        jko jkoVar;
        jko jkoVar2;
        jko jkoVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        i.d(j.a("AsyncTaskOptimize"), "开始缓存theme模板");
        String b = ecn.b(context, "layoutTemplateId", eni.e);
        String b2 = ecn.b(context, "ruleTemplateId", eni.f);
        String b3 = ecn.b(context, "actionTemplateId", eni.g);
        String b4 = ecn.b(context, "themeTemplateId", eni.h);
        ArrayList<jkn> arrayList = new ArrayList<>();
        eni a3 = eni.a(context);
        if (!a3.b(b)) {
            arrayList.add(new jkn(b, eni.e, eni.f27462a));
        }
        if (!a3.c(b2)) {
            arrayList.add(new jkn(b2, eni.f, eni.b));
        }
        if (!a3.d(b3)) {
            arrayList.add(new jkn(b3, eni.g, eni.c));
        }
        if (!a3.e(b4)) {
            arrayList.add(new jkn(b4, eni.h, eni.d));
        }
        if (arrayList.size() == 0) {
            return;
        }
        HashMap<String, jko> a4 = jkl.a(context).a(arrayList, true);
        if (a4 == null) {
            i.d("TAO_DETAIL", "get templates is failed.");
            return;
        }
        if (!a3.b(b)) {
            a3.a(a4.get(b), b);
        }
        if (!a3.c(b2) && (jkoVar3 = a4.get(b2)) != null) {
            a3.a(jkoVar3.b, b2);
        }
        if (!a3.d(b3) && (jkoVar2 = a4.get(b3)) != null) {
            a3.b(jkoVar2.b, b3);
        }
        if (!a3.e(b4) && (jkoVar = a4.get(b4)) != null) {
            a3.c(jkoVar.b, b4);
        }
        HashMap<String, HashMap<String, RuleModel>> d = a3.d();
        ArrayList arrayList2 = new ArrayList();
        if (d != null) {
            for (HashMap<String, RuleModel> hashMap : d.values()) {
                for (RuleModel ruleModel : hashMap.values()) {
                    if (arrayList2.size() < 25 && (a2 = a(ruleModel)) != null) {
                        arrayList2.add(a2);
                    }
                }
            }
        }
        b.a().a(arrayList2);
        if (epv.e) {
            try {
                joj.a(context, "detail").b();
            } catch (Throwable th) {
                i.a("AsyncTaskOptimize", "launcher#preloadTemplates", th);
            }
        }
        i.d(j.a("AsyncTaskOptimize"), "缓存模板完成");
    }

    private DinamicTemplate a(RuleModel ruleModel) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("7489d6a1", new Object[]{this, ruleModel});
        }
        if (StringUtils.isEmpty(ruleModel.mapping) || (parseObject = JSONObject.parseObject(ruleModel.mapping)) == null || (jSONObject = parseObject.getJSONObject("template")) == null) {
            return null;
        }
        String a2 = epw.a(jSONObject.getString("name"));
        String a3 = epw.a(jSONObject.getString("android"));
        String a4 = epw.a(jSONObject.getString("version"));
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(a4) || StringUtils.isEmpty(a3)) {
            return null;
        }
        DinamicTemplate dinamicTemplate = new DinamicTemplate();
        dinamicTemplate.name = a2;
        dinamicTemplate.version = a4;
        dinamicTemplate.templateUrl = a3;
        return dinamicTemplate;
    }
}
