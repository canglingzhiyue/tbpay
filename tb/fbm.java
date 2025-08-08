package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.Map;

/* loaded from: classes5.dex */
public class fbm extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27749a;
    public Map<String, String> b;
    public Map<String, String> c;
    public int d;

    static {
        kge.a(-1718744767);
    }

    public fbm(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.WeexViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("url")) {
            this.f27749a = jSONObject.getString("url");
        }
        if (jSONObject.containsKey("data")) {
            this.b = epw.a(jSONObject.getJSONObject("data"), new epy<String>() { // from class: tb.fbm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.epy
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                }
            });
        }
        if (!jSONObject.containsKey("config")) {
            return;
        }
        this.c = epw.a(jSONObject.getJSONObject("config"), new epy<String>() { // from class: tb.fbm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
            }
        });
        try {
            this.d = epo.b(Integer.valueOf(this.c.get("height")).intValue());
        } catch (Throwable unused) {
            this.d = epo.b(100);
        }
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f27749a);
    }
}
