package com.taobao.android.navigationextern.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.e;
import tb.esv;
import tb.hut;
import tb.omr;

/* loaded from: classes6.dex */
public class IconIntroductoryDatasource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f14471a = new UcpTabBarChangedReceiver();
    private final b b;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int OP_ADD = 11;
        public static final int OP_REMOVE = 12;
        public static final int OP_REMOVE_INTRODUCTORY = 13;

        /* renamed from: a  reason: collision with root package name */
        public int f14473a;
        public String b;
        public String c;
        public JSONObject d;
        public String e;
        public String f;
        public String g;

        public a(int i) {
            this.f14473a = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DataCompat{op=" + this.f14473a + ", materialType='" + this.b + "', materialSubType='" + this.c + "', resourceObject=" + this.d + ", bizCode='" + this.e + "', trackInfo='" + this.f + "', bizData='" + this.g + "'}";
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(a aVar);
    }

    public static /* synthetic */ void a(IconIntroductoryDatasource iconIntroductoryDatasource, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58bd86eb", new Object[]{iconIntroductoryDatasource, jSONArray});
        } else {
            iconIntroductoryDatasource.c(jSONArray);
        }
    }

    public static /* synthetic */ void a(IconIntroductoryDatasource iconIntroductoryDatasource, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccf9edf", new Object[]{iconIntroductoryDatasource, obj});
        } else {
            iconIntroductoryDatasource.a(obj);
        }
    }

    public IconIntroductoryDatasource(b bVar) {
        this.b = bVar;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        esv.a(context, this.f14471a);
        if (!e.n()) {
            return;
        }
        esv.b(context, this.f14471a);
    }

    private void c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ee4c92", new Object[]{this, jSONArray});
        } else if (jSONArray == null) {
            hut.b("IconIntroductoryDatasource", "removeIntroductoryByConfig removeList is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    a aVar = new a(13);
                    aVar.e = jSONObject.getString("bizCode");
                    this.b.a(aVar);
                } catch (Exception e) {
                    hut.b("IconIntroductoryDatasource", "removeByConfig" + e);
                }
            }
        }
    }

    private void a(JSONArray jSONArray) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray == null) {
            hut.b("IconIntroductoryDatasource", "removeByConfig removeList is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    aVar = new a(12);
                    aVar.b = jSONObject.getString("materialType");
                    aVar.e = jSONObject.getString("bizCode");
                    aVar.f = jSONObject.getString("trackInfo");
                } catch (Exception e) {
                    hut.b("IconIntroductoryDatasource", "removeByConfig" + e);
                }
                if (!StringUtils.isEmpty(aVar.e) && !StringUtils.isEmpty(aVar.f) && !StringUtils.isEmpty(aVar.b)) {
                    this.b.a(aVar);
                }
                hut.b("IconIntroductoryDatasource", "removeByConfig error. dataCompat: " + aVar);
                omr.a("IconIntroductoryDatasource", "removeByConfig error, some params is empty");
            }
        }
    }

    private void b(JSONArray jSONArray) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    aVar = new a(11);
                    aVar.b = jSONObject.getString("materialType");
                    aVar.c = jSONObject.getString("materialSubType");
                    aVar.d = jSONObject.getJSONObject("resource");
                    aVar.e = jSONObject.getString("bizCode");
                    aVar.f = jSONObject.getString("trackInfo");
                    aVar.g = jSONObject.getString("bizData");
                } catch (Exception e) {
                    hut.b("IconIntroductoryDatasource", "onConfigUpdated" + e);
                }
                if (!StringUtils.isEmpty(aVar.e) && !StringUtils.isEmpty(aVar.f) && aVar.d != null && !StringUtils.isEmpty(aVar.b) && !StringUtils.isEmpty(aVar.c) && !StringUtils.isEmpty(aVar.g)) {
                    this.b.a(aVar);
                }
                hut.b("IconIntroductoryDatasource", "onConfigUpdated error. dataCompat: " + aVar);
                omr.a("IconIntroductoryDatasource", "addByConfig error, some params is empty");
            }
        }
    }

    private void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject)) {
            hut.b("IconIntroductoryDatasource", "onConfigUpdated configJson is not JSONObject");
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            a(jSONObject.getJSONArray("removeList"));
            b(jSONObject.getJSONArray("addList"));
        }
    }

    /* loaded from: classes6.dex */
    public class UcpTabBarChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private UcpTabBarChangedReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                String action = intent.getAction();
                if (esv.ACTION_UCP_TAB_CONFIG_CHANGE.equals(action)) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        return;
                    }
                    IconIntroductoryDatasource.a(IconIntroductoryDatasource.this, extras.get("data"));
                } else if (!"UCPTabBarShouldRemove".equals(action)) {
                } else {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null) {
                        hut.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE extra is null");
                        return;
                    }
                    Object obj = extras2.get("data");
                    if (!(obj instanceof JSONObject)) {
                        hut.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE data is not JSONObject. data: " + obj);
                        return;
                    }
                    Object obj2 = ((JSONObject) obj).get("removeList");
                    if (!(obj2 instanceof JSONArray)) {
                        hut.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE removeList is not JSONArray. removeList: " + obj2);
                        return;
                    }
                    IconIntroductoryDatasource.a(IconIntroductoryDatasource.this, (JSONArray) obj2);
                }
            }
        }
    }
}
