package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class Certification extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "certification";
    public ArrayList<a> items;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9956a;
        public String b;

        static {
            kge.a(1924864214);
        }

        public a(JSONObject jSONObject) {
            this.f9956a = epw.a(jSONObject.getString("icon"));
            this.b = epw.a(jSONObject.getString("txt"));
        }
    }

    static {
        kge.a(1426896621);
    }

    public Certification(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.items = initKeywords();
        } catch (Exception unused) {
            this.items = null;
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.Certification");
    }

    private ArrayList<a> initKeywords() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("42a5c9bb", new Object[]{this}) : epw.a(this.data.getJSONArray("items"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.Certification.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.Certification$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("d67b8197", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }
}
