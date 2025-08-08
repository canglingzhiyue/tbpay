package com.taobao.family.globalbubble.affection;

import android.content.Context;
import android.taobao.util.i;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.FamilyManager;
import com.taobao.family.FamilyMember;
import com.taobao.family.c;
import com.taobao.family.globalbubble.GlobalWindowFactory;
import com.taobao.family.globalbubble.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.xmx;

/* loaded from: classes7.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<FamilyMember> h;
    private HashMap<String, String> i;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 95609329) {
            return new Boolean(super.f());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.family.globalbubble.h
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "FamilyBubble";
    }

    @Override // com.taobao.family.globalbubble.h
    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : "family_bubble";
    }

    public static /* synthetic */ ArrayList a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("cf267494", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ HashMap a(a aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5a989adc", new Object[]{aVar, hashMap});
        }
        aVar.i = hashMap;
        return hashMap;
    }

    public static /* synthetic */ HashMap b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("b7d9285e", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ i c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("b4625a10", new Object[]{aVar}) : aVar.f17142a;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72787fbd", new Object[]{aVar});
        } else {
            aVar.p();
        }
    }

    public static /* synthetic */ i e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("7ab9c092", new Object[]{aVar}) : aVar.f17142a;
    }

    public a(Context context, boolean z, int i) {
        super(context, z, i);
        this.h = new ArrayList<>();
        this.i = new HashMap<>();
        o();
        q();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            FamilyManager.registerBubbleDisplayListener(new c() { // from class: com.taobao.family.globalbubble.affection.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.family.c
                public void a(List<FamilyMember> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    } else if (list != null) {
                        synchronized (a.this) {
                            a.a(a.this).clear();
                            a.a(a.this).addAll(list);
                            HashMap hashMap = new HashMap();
                            Iterator it = a.a(a.this).iterator();
                            while (it.hasNext()) {
                                FamilyMember familyMember = (FamilyMember) it.next();
                                String str = (String) a.b(a.this).get(familyMember.userId);
                                if (StringUtils.isEmpty(str)) {
                                    hashMap.put(familyMember.userId, "0");
                                } else {
                                    hashMap.put(familyMember.userId, str);
                                }
                            }
                            a.a(a.this, hashMap);
                        }
                        StringBuilder sb = new StringBuilder("Size:" + list.size());
                        for (FamilyMember familyMember2 : list) {
                            sb.append("userId:");
                            sb.append(familyMember2.userId);
                            sb.append("reloId:");
                            sb.append(familyMember2.relationName);
                        }
                        a.this.c();
                        String str2 = "FamilyRelationChanged" + sb.toString();
                        if (list.size() > 0) {
                            a.c(a.this).sendEmptyMessage(1);
                            a.this.l();
                            a.d(a.this);
                            return;
                        }
                        a.e(a.this).sendEmptyMessage(2);
                    }
                }

                @Override // com.taobao.family.c
                public void b(List<FamilyMember> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d39e1eda", new Object[]{this, list});
                    } else {
                        a.this.c();
                    }
                }
            });
        }
    }

    @Override // com.taobao.family.globalbubble.h
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : com.taobao.family.globalbubble.c.a().c;
    }

    @Override // com.taobao.family.globalbubble.h, com.taobao.family.globalbubble.e
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (this.b == null) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -554827229) {
                if (hashCode == -55969654 && str.equals(GlobalWindowFactory.EVENT_LOCATION_RESET)) {
                    c = 1;
                }
            } else if (str.equals(GlobalWindowFactory.EVENT_AMP_CONVERSATION)) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            a(map);
        }
    }

    private synchronized void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.i == null) {
        } else {
            String str = (String) map.get("userId");
            String str2 = (String) map.get("msgCount");
            if (!StringUtils.isEmpty(str) && this.i.containsKey(str)) {
                this.i.put(str, str2);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.i.keySet().iterator();
            while (it.hasNext()) {
                it.next();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("userId", str);
                hashMap2.put("msgCount", str2);
                arrayList.add(hashMap2);
            }
            hashMap.put("msgList", arrayList);
            a("gbGlobalNoticeChanged", hashMap);
        }
    }

    @Override // com.taobao.family.globalbubble.h
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (super.f()) {
            return true;
        }
        try {
            String c = c();
            StringBuilder sb = new StringBuilder();
            sb.append("preShow:");
            sb.append(e());
            sb.append(String.valueOf(this.h.size() == 0));
            sb.append(String.valueOf(!this.d));
            k.a(c, sb.toString());
        } catch (OutOfMemoryError unused) {
        }
        return com.taobao.family.globalbubble.c.a().a(GlobalWindowFactory.WINDOW_SHAREBACK) || this.h.size() == 0;
    }

    @Override // com.taobao.family.globalbubble.h
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        k.a(c(), "sendInitMessage");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userList", this.h);
        a("gbGlobalQqhRelationChanged", hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        for (String str : this.i.keySet()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("userId", str);
            hashMap3.put("msgCount", this.i.get(str));
            arrayList.add(hashMap3);
        }
        hashMap2.put("msgList", arrayList);
        a("gbGlobalNoticeChanged", hashMap2);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.g.a(new ArrayList(this.h));
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.g.a(new xmx() { // from class: com.taobao.family.globalbubble.affection.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.xmx
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.a(a.this).clear();
                    }
                }
            });
        }
    }
}
