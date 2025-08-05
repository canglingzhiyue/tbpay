package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class NativeFloatButtonNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NATIVE_FLOAT_BUTTON = "nativeFloatButton";
    public static final String TAG = "resource";
    private ArrayList<a> floatButtons;

    static {
        kge.a(822407660);
    }

    public ArrayList<a> getFloatButtons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("64f605dc", new Object[]{this}) : this.floatButtons;
    }

    public NativeFloatButtonNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode");
    }

    public NativeFloatButtonNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject != null) {
            this.floatButtons = epw.a(jSONObject.getJSONArray(NATIVE_FLOAT_BUTTON), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode$a, java.lang.Object] */
                @Override // tb.epy
                public /* synthetic */ a b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public a a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("27ff0c38", new Object[]{this, obj}) : new a((JSONObject) obj);
                }
            });
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f9978a;
        private String b;
        private String c;
        private C0384a d;
        private String e;

        static {
            kge.a(-184198698);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f9978a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public C0384a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0384a) ipChange.ipc$dispatch("d52b2e14", new Object[]{this}) : this.d;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public a() {
        }

        public a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9978a = jSONObject.getBooleanValue("showDetailPopBtn");
                this.b = epw.a(jSONObject.getString("btnImageUrl"));
                this.c = epw.a(jSONObject.getString("actionType"));
                this.d = new C0384a(jSONObject.getJSONObject("actionData"));
                this.e = epw.a(jSONObject.getString("bizCode"));
            }
        }

        /* renamed from: com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0384a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private String f9979a;
            private String b;
            private JSONObject c;
            private String d;

            static {
                kge.a(221408142);
            }

            public String a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f9979a;
            }

            public JSONObject b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.c;
            }

            public String c() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
            }

            public C0384a() {
            }

            public C0384a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    this.f9979a = epw.a(jSONObject.getString("abilityName"));
                    this.b = epw.a(jSONObject.getString("apiName"));
                    this.c = jSONObject.getJSONObject("params");
                    this.d = epw.a(jSONObject.getString("url"));
                }
            }
        }
    }
}
