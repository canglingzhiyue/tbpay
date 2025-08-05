package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Props;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.BundleProductInfoFragment;
import com.taobao.android.detail.ttdetail.handler.fragment.ProductInfoFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class r implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openProductParams";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_product_params";

    /* renamed from: a  reason: collision with root package name */
    public String f10722a;
    public String c;
    public ArrayList<Pair<String, String>> d;
    private FragmentActivity e;
    private eyx f;
    private JSONObject g;
    private String h = odg.o().a(R.string.tt_detail_detail_title_product_info);
    public boolean b = false;

    static {
        kge.a(-136385498);
        kge.a(1967244270);
    }

    public r(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.e = (FragmentActivity) context;
        }
        this.f = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        this.g = aVar.b();
        this.d = c();
        ArrayList<Pair<String, String>> a2 = a();
        List<Props.a> b = b();
        if (a2 != null && !a2.isEmpty() && this.b) {
            try {
                String str = this.h;
                if (!TextUtils.isEmpty(this.c)) {
                    str = this.c;
                }
                ProductInfoFragment.startFragment(this.e, str, a2);
            } catch (Exception unused) {
            }
            return true;
        } else if (a2 != null && !a2.isEmpty()) {
            try {
                ProductInfoFragment.startFragment(this.e, this.h, a2);
            } catch (Exception unused2) {
            }
            return true;
        } else if (b == null || b.isEmpty()) {
            return false;
        } else {
            try {
                BundleProductInfoFragment.startFragment(this.e, this.h, b());
            } catch (Exception unused3) {
            }
            return true;
        }
    }

    public ArrayList<Pair<String, String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = this.d;
        if (arrayList != null && arrayList.size() != 0) {
            return this.d;
        }
        Props props = (Props) this.f.a().a(Props.class);
        if (props == null) {
            return null;
        }
        return props.getPropList();
    }

    public List<Props.a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        Props props = (Props) this.f.a().a(Props.class);
        if (props == null) {
            return null;
        }
        return props.getBundleProps();
    }

    private ArrayList<Pair<String, String>> c() {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.g;
        if (jSONObject == null) {
            this.b = false;
            return arrayList;
        }
        this.b = true;
        try {
            Set<String> keySet2 = jSONObject.keySet();
            if (keySet2 != null) {
                Iterator<String> it = keySet2.iterator();
                if (it.hasNext()) {
                    this.f10722a = it.next();
                }
            }
            Iterator<Object> it2 = this.g.getJSONArray(this.f10722a).iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it2.next();
                if (TextUtils.isEmpty(this.c) && (keySet = jSONObject2.keySet()) != null) {
                    Iterator<String> it3 = keySet.iterator();
                    if (it3.hasNext()) {
                        this.c = it3.next();
                    }
                }
                Iterator<Object> it4 = jSONObject2.values().iterator();
                while (it4.hasNext()) {
                    Iterator<Object> it5 = ((JSONArray) it4.next()).iterator();
                    while (it5.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it5.next();
                        for (String str : jSONObject3.keySet()) {
                            String string = jSONObject3.getString(str);
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                                arrayList.add(new Pair<>(str, string));
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
