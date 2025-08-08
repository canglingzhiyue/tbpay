package com.alibaba.android.ultron.vfw.viewholder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.bny;
import tb.jpr;
import tb.jpu;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sBroadcastActionDXButterDowngrade = "ultron.dx.downgrade";
    public static final String sBroadcastKeyBizCode = "bizCode";

    /* renamed from: a */
    private bny f2745a;
    private int b = 0;
    private final ArrayMap<String, Integer> c = new ArrayMap<>();
    private final ArrayMap<Integer, DXTemplateItem> d = new ArrayMap<>();
    private final ArrayMap<Integer, ArrayList<IDMComponent>> e = new ArrayMap<>();
    private BroadcastReceiver f;

    static {
        kge.a(-178358646);
    }

    public static /* synthetic */ ArrayMap a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("a3e99add", new Object[]{lVar}) : lVar.c;
    }

    public static /* synthetic */ ArrayMap b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("4b65749e", new Object[]{lVar}) : lVar.e;
    }

    public l(bny bnyVar, boolean z) {
        this.f2745a = bnyVar;
        if (z) {
            a(bnyVar);
        }
    }

    private void a(final bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, bnyVar});
            return;
        }
        jqg.b("UltronDXViewTypeManager", "registerDowngradeReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(sBroadcastActionDXButterDowngrade);
        this.f = new BroadcastReceiver() { // from class: com.alibaba.android.ultron.vfw.viewholder.UltronDXViewTypeManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                String string = extras.getString("bizCode", null);
                String r = bnyVar.r();
                if (StringUtils.isEmpty(string) || !string.equals(r)) {
                    return;
                }
                l.a(l.this).clear();
                l.b(l.this).clear();
                bnyVar.a(127);
                jqg.b("UltronDXViewTypeManager", "降级，清空ItemType");
            }
        };
        LocalBroadcastManager.getInstance(bnyVar.k()).registerReceiver(this.f, intentFilter);
    }

    public int a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e66567df", new Object[]{this, iDMComponent})).intValue();
        }
        bny bnyVar = this.f2745a;
        if (iDMComponent == null || iDMComponent.getContainerInfo() == null || bnyVar == null) {
            return -1;
        }
        String string = iDMComponent.getContainerInfo().getString("name");
        DXTemplateItem a2 = ((com.alibaba.android.ultron.vfw.template.b) ((com.alibaba.android.ultron.vfw.template.f) bnyVar.a(com.alibaba.android.ultron.vfw.template.f.class)).a(iDMComponent.getContainerType())).a(string);
        if (a2 == null) {
            String r = bnyVar.r();
            jpu a3 = jpu.a(r);
            jpu c = a3.c(r + "#FetchDXTemplateError");
            jpr.a(c.b("templateName:" + string));
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a2.f11925a);
        sb.append(a2.b);
        if (bnyVar.u()) {
            try {
                sb.append(bnyVar.l().a().indexOf(iDMComponent));
            } catch (Exception unused) {
            }
        }
        Integer num = this.c.get(sb.toString());
        if (num == null) {
            int i = this.b;
            this.b = i + 1;
            num = Integer.valueOf(i);
            this.c.put(sb.toString(), num);
            this.d.put(num, a2);
            ArrayList<IDMComponent> arrayList = new ArrayList<>();
            arrayList.add(iDMComponent);
            this.e.put(num, arrayList);
        } else {
            this.e.get(num).add(iDMComponent);
        }
        return num.intValue();
    }

    public DXTemplateItem a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("ec611004", new Object[]{this, new Integer(i)}) : this.d.get(Integer.valueOf(i));
    }

    public ArrayList<IDMComponent> b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b2faef14", new Object[]{this, new Integer(i)}) : this.e.get(Integer.valueOf(i));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f != null && this.f2745a != null) {
                LocalBroadcastManager.getInstance(this.f2745a.k()).unregisterReceiver(this.f);
                this.f = null;
                jqg.b("UltronDXViewTypeManager", "unregisterDowngradeReceiver");
            }
            this.f2745a = null;
        } catch (Throwable unused) {
        }
    }
}
