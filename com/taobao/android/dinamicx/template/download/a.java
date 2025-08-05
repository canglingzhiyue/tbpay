package com.taobao.android.dinamicx.template.download;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.aw;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fva;
import tb.fwn;
import tb.fxb;
import tb.fxc;
import tb.fxe;
import tb.fxn;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f11926a;
    private WeakReference<fva> b;
    private Map<String, DXTemplateItem> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.android.dinamicx.template.download.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0477a {
        void a(DXResult<DXTemplateItem> dXResult);

        void a(DXTemplateItem dXTemplateItem);
    }

    static {
        kge.a(1406518028);
    }

    public static /* synthetic */ WeakReference a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("5f76d18b", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void a(a aVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79535124", new Object[]{aVar, sVar});
        } else {
            aVar.a(sVar);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, DXTemplateItem dXTemplateItem, i iVar, InterfaceC0477a interfaceC0477a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2f08fb", new Object[]{aVar, str, dXTemplateItem, iVar, interfaceC0477a});
        } else {
            aVar.a(str, dXTemplateItem, iVar, interfaceC0477a);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cf894a", new Object[]{aVar, str, str2, dXTemplateItem, new Long(j)});
        } else {
            aVar.a(str, str2, dXTemplateItem, j);
        }
    }

    public static /* synthetic */ boolean a(a aVar, String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe3b3434", new Object[]{aVar, str, dXTemplateItem})).booleanValue() : aVar.a(str, dXTemplateItem);
    }

    public a(h hVar, fva fvaVar, Map<String, DXTemplateItem> map) {
        if (hVar == null) {
            this.f11926a = new g();
        } else {
            this.f11926a = hVar;
        }
        this.b = new WeakReference<>(fvaVar);
        this.c = map;
    }

    public void a(final String str, final List<DXTemplateItem> list, final i iVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d5483a", new Object[]{this, str, list, iVar, new Boolean(z)});
        } else if (list == null || list.size() <= 0) {
        } else {
            fxc fxcVar = new fxc(0, new Runnable() { // from class: com.taobao.android.dinamicx.template.download.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (DXTemplateItem dXTemplateItem : list) {
                        final long nanoTime = System.nanoTime();
                        final b bVar = new b();
                        fux.b("开始下载模板" + dXTemplateItem.toString());
                        a.a(a.this, str, dXTemplateItem, iVar, new InterfaceC0477a() { // from class: com.taobao.android.dinamicx.template.download.a.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.dinamicx.template.download.a.InterfaceC0477a
                            public void a(DXTemplateItem dXTemplateItem2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem2});
                                    return;
                                }
                                if (fqi.h()) {
                                    a.a(a.this, str, dXTemplateItem2);
                                }
                                b bVar2 = bVar;
                                bVar2.b = true;
                                bVar2.f11929a = dXTemplateItem2;
                                fva fvaVar = (fva) a.a(a.this).get();
                                if (fvaVar != null && z) {
                                    fux.b("模板下载通知");
                                    fvaVar.a(bVar);
                                }
                                fux.b("模板下载完成" + dXTemplateItem2.toString());
                                a.a(a.this, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD_COUNT, str, dXTemplateItem2, System.nanoTime() - nanoTime);
                            }

                            @Override // com.taobao.android.dinamicx.template.download.a.InterfaceC0477a
                            public void a(DXResult<DXTemplateItem> dXResult) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d8f6eeb3", new Object[]{this, dXResult});
                                    return;
                                }
                                if (fqi.h()) {
                                    a.a(a.this, str, dXResult.f11780a);
                                }
                                b bVar2 = bVar;
                                bVar2.b = false;
                                bVar2.f11929a = dXResult.f11780a;
                                fva fvaVar = (fva) a.a(a.this).get();
                                if (fvaVar != null && z) {
                                    fvaVar.a(bVar);
                                }
                                if (dXResult != null && dXResult.f11780a != null && !TextUtils.isEmpty(dXResult.f11780a.c)) {
                                    s sVar = new s(str);
                                    sVar.c = new ArrayList();
                                    s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD_COUNT, 60004);
                                    sVar.b = dXResult.f11780a;
                                    sVar.c.add(aVar);
                                    a.a(a.this, sVar);
                                }
                                a.a(a.this, dXResult.a());
                                if (bVar.f11929a != null) {
                                    fux.b("模板下载失败" + bVar.f11929a.toString());
                                    return;
                                }
                                fux.b("模板下载失败 result.item ==null");
                            }
                        });
                    }
                }
            });
            if (z) {
                fxe.a(fxcVar);
            } else {
                fxcVar.run();
            }
        }
    }

    private void a(String str, DXTemplateItem dXTemplateItem, i iVar, InterfaceC0477a interfaceC0477a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9063a3a6", new Object[]{this, str, dXTemplateItem, iVar, interfaceC0477a});
            return;
        }
        DXResult<DXTemplateItem> dXResult = new DXResult<>();
        s sVar = new s(str);
        byte[] bArr = null;
        String a2 = a(dXTemplateItem.c);
        if (!TextUtils.isEmpty(a2)) {
            h hVar = this.f11926a;
            if (hVar instanceof g) {
                bArr = ((g) hVar).a(a2, str, dXTemplateItem);
            } else {
                bArr = hVar.a(a2);
            }
        } else {
            String b = dXTemplateItem == 0 ? "null" : dXTemplateItem.b();
            fux.b(str + "传入的url是空 " + b);
        }
        if (bArr == null) {
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DOWNLOADER, DXMonitorConstant.DX_MONITOR_DOWNLOADER_DOWNLOAD, TextUtils.isEmpty(a2) ? s.DX_DB_OPEN_ERROR_38 : 60000);
            dXResult.f11780a = dXTemplateItem;
            sVar.b = dXTemplateItem;
            sVar.c.add(aVar);
            dXResult.a(sVar);
            interfaceC0477a.a(dXResult);
            return;
        }
        if (c.a(dXTemplateItem, bArr, fwn.a().b() + fxb.DIR + str + fxb.DIR + dXTemplateItem.f11925a + fxb.DIR + dXTemplateItem.b + fxb.DIR, iVar, sVar)) {
            interfaceC0477a.a(dXTemplateItem);
            return;
        }
        dXResult.f11780a = dXTemplateItem;
        dXResult.a(sVar);
        interfaceC0477a.a(dXResult);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.indexOf("._dxv4") < 0) {
            return str;
        }
        String str2 = str.split("._dxv4")[0];
        if (fxn.a().c()) {
            return str2 + "_js.zip";
        }
        return str2 + "_android.zip";
    }

    private void a(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466a1f3f", new Object[]{this, str, str2, dXTemplateItem, new Long(j)});
        } else {
            com.taobao.android.dinamicx.monitor.b.a(2, str2, DXMonitorConstant.DX_MONITOR_DOWNLOADER, str, dXTemplateItem, (Map<String, String>) null, j, true);
        }
    }

    private void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea75199", new Object[]{this, sVar});
        } else {
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    private boolean a(String str, DXTemplateItem dXTemplateItem) {
        Map<String, DXTemplateItem> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df0205f", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem != null && (map = this.c) != null && !map.isEmpty()) {
            String a2 = aw.a(str, dXTemplateItem);
            for (Map.Entry<String, DXTemplateItem> entry : this.c.entrySet()) {
                if (a2.equals(entry.getKey())) {
                    this.c.remove(entry.getKey());
                    if (DinamicXEngine.j()) {
                        fuw.a("DXDownloadManager", a2 + " 已在下载完成，从队列移除 " + this.c.size());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
