package com.taobao.mytaobao.ultron.fatigue;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f18520a = new HashSet();
    private Set<a> b = new HashSet();
    private boolean c = false;

    static {
        kge.a(143608042);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f18521a;
        public int b;
        public int c;

        static {
            kge.a(-1017650373);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return StringUtils.equals(this.f18521a, ((a) obj).f18521a);
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : String.valueOf(this.f18521a).hashCode();
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!StringUtils.isEmpty(str)) {
            a aVar = null;
            for (a aVar2 : this.b) {
                if (StringUtils.equals(str, aVar2.f18521a)) {
                    aVar2.c++;
                    aVar2.b = i;
                    if (aVar2.c >= aVar2.b) {
                        aVar = aVar2;
                    }
                    z = true;
                }
            }
            if (!z && !this.f18520a.contains(str)) {
                a aVar3 = new a();
                aVar3.b = i;
                aVar3.c = 1;
                aVar3.f18521a = str;
                if (i > 1) {
                    this.b.add(aVar3);
                } else {
                    aVar = aVar3;
                }
            }
            if (aVar != null && !this.f18520a.contains(aVar.f18521a)) {
                this.f18520a.add(aVar.f18521a);
                this.b.remove(aVar);
            }
            d();
        }
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        HashSet hashSet = new HashSet(this.f18520a);
        this.f18520a.clear();
        d();
        return hashSet;
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.f18520a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.f18520a.add(str);
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                if (StringUtils.equals(it.next().f18521a, str)) {
                    it.remove();
                }
            }
            d();
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        c();
        Set<a> set = this.b;
        if (set != null && set.size() > 0 && list != null && list.size() > 0) {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                if (!list.contains(it.next().f18521a)) {
                    it.remove();
                }
            }
        }
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!this.c) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
            String string = defaultSharedPreferences.getString("arriveFatigue", "");
            if (!StringUtils.isEmpty(string)) {
                try {
                    JSONArray parseArray = JSON.parseArray(string);
                    if (parseArray != null && parseArray.size() > 0) {
                        for (int i = 0; i < parseArray.size(); i++) {
                            this.f18520a.add(parseArray.getString(i));
                        }
                    }
                } catch (Exception e) {
                    TLog.loge("DeliverFatigueManager", Log.getStackTraceString(e));
                }
            }
            String string2 = defaultSharedPreferences.getString("processFatigue", "");
            if (!StringUtils.isEmpty(string2)) {
                try {
                    JSONArray parseArray2 = JSON.parseArray(string2);
                    if (parseArray2 != null && parseArray2.size() > 0) {
                        for (int i2 = 0; i2 < parseArray2.size(); i2++) {
                            this.b.add(parseArray2.getObject(i2, a.class));
                        }
                    }
                } catch (Exception e2) {
                    TLog.loge("DeliverFatigueManager", Log.getStackTraceString(e2));
                }
            }
        }
        this.c = true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit().putString("processFatigue", JSON.toJSONString(this.b)).putString("arriveFatigue", JSON.toJSONString(this.f18520a)).apply();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Set<String> a2 = a();
        if (a2 == null || a2.size() <= 0) {
            return;
        }
        MtopTaobaoMclarenFatigueRequest mtopTaobaoMclarenFatigueRequest = new MtopTaobaoMclarenFatigueRequest();
        mtopTaobaoMclarenFatigueRequest.setOrderFatigue(JSON.toJSONString(a2));
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopTaobaoMclarenFatigueRequest, TaoHelper.getTTID());
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ultron.fatigue.DeliverFatigueManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }
        });
        build.startRequest();
    }
}
