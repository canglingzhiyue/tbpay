package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fbz extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27774a;
    public ArrayList<a> b;
    public String c;
    public int d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27777a;
        public String b;

        static {
            kge.a(-1871806304);
        }

        public a(JSONObject jSONObject) {
            this.f27777a = epw.a(jSONObject.getString("portrait"));
            this.b = epw.a(jSONObject.getString("subIcon"));
        }
    }

    static {
        kge.a(-287576227);
    }

    public fbz(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.AvatarGroupsViewModel");
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject == null) {
            return;
        }
        this.f27774a = epw.a(jSONObject.getString("title"));
        this.c = epw.a(jSONObject.getString("defaultPortrait"));
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("avatars");
            if (jSONArray != null) {
                this.b = epw.a(jSONArray, new epy<a>() { // from class: tb.fbz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.fbz$a] */
                    @Override // tb.epy
                    public /* synthetic */ a b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public a a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("533880e7", new Object[]{this, obj}) : new a((JSONObject) obj);
                    }
                });
            }
        } catch (Throwable unused) {
        }
        this.d = jSONObject.getIntValue("groupSize");
        ArrayList<a> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        this.d = Math.max(this.d, arrayList.size());
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        ArrayList<a> arrayList = this.b;
        if (arrayList == null || arrayList.size() <= i) {
            return this.c;
        }
        a aVar = this.b.get(i);
        return TextUtils.isEmpty(aVar.f27777a) ? this.c : aVar.f27777a;
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        ArrayList<a> arrayList = this.b;
        if (arrayList == null || arrayList.size() <= i) {
            return null;
        }
        a aVar = this.b.get(i);
        if (!TextUtils.isEmpty(aVar.b)) {
            return aVar.b;
        }
        return null;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.d > 0 || !TextUtils.isEmpty(this.f27774a);
    }

    public fbz(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.AvatarGroupsViewModel");
        JSONObject fields = iDMComponent.getFields();
        if (fields == null) {
            return;
        }
        this.f27774a = epw.a(fields.getString("title"));
        this.c = epw.a(fields.getString("defaultPortrait"));
        try {
            JSONArray jSONArray = fields.getJSONArray("avatars");
            if (jSONArray != null) {
                this.b = epw.a(jSONArray, new epy<a>() { // from class: tb.fbz.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.fbz$a] */
                    @Override // tb.epy
                    public /* synthetic */ a b(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public a a(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("533880e7", new Object[]{this, obj}) : new a((JSONObject) obj);
                    }
                });
            }
        } catch (Throwable unused) {
        }
        this.d = fields.getIntValue("groupSize");
        ArrayList<a> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        this.d = Math.max(this.d, arrayList.size());
    }
}
