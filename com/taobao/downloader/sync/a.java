package com.taobao.downloader.sync;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.downloader.TbDownloader;
import com.taobao.downloader.c;
import java.util.List;
import tb.kml;
import tb.kmm;
import tb.kmq;
import tb.kmv;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "fileSync";

    /* renamed from: a  reason: collision with root package name */
    private boolean f17088a;
    private boolean c;
    private int b = 0;
    private boolean d = false;

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca16a23", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478c8d15", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.d = z;
        return z;
    }

    public static /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b37a29d7", new Object[]{aVar})).intValue();
        }
        int i = aVar.b;
        aVar.b = i + 1;
        return i;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbcbc574", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.c = z;
        return z;
    }

    public a() {
        b.a().a(new Runnable() { // from class: com.taobao.downloader.sync.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.this, true);
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kmv.a(TAG, "start Download", new Object[0]);
        this.f17088a = true;
        Coordinator.postTask(new Coordinator.TaggedRunnable("download_sdk") { // from class: com.taobao.downloader.sync.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kmv.a(TAG, "stop download", new Object[0]);
        this.f17088a = false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c || b.a().b()) {
        } else {
            if (this.d) {
                this.b = 0;
                this.d = false;
            }
            try {
                List<SyncItem> c = b.a().c();
                if (c == null || this.b >= c.size() || !this.f17088a) {
                    return;
                }
                final SyncItem syncItem = c.get(this.b);
                if (!TextUtils.isEmpty(syncItem.version) && !c.a(syncItem.version)) {
                    kmv.c(TAG, "download item vesion is not need to download", "url", syncItem.url, "version", syncItem.version);
                    syncItem.finish = true;
                    this.b++;
                    c();
                    return;
                }
                this.c = true;
                kmv.b(TAG, "download start sync", "url", syncItem.url);
                kmm convert = syncItem.convert();
                if (!TextUtils.isEmpty(TbDownloader.getInstance().a(convert.b.h, convert.f30166a.get(0)))) {
                    this.b++;
                    this.c = false;
                    c();
                    return;
                }
                TbDownloader.getInstance().a(convert, new kml() { // from class: com.taobao.downloader.sync.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.kml
                    public void onDownloadError(String str, int i, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                        }
                    }

                    @Override // tb.kml
                    public void onDownloadFinish(String str, String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                        }
                    }

                    @Override // tb.kml
                    public void onDownloadProgress(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // tb.kml
                    public void onDownloadStateChange(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                        }
                    }

                    @Override // tb.kml
                    public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                        }
                    }

                    @Override // tb.kml
                    public void onFinish(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        kmv.b(a.TAG, "download, finish sync", "url", syncItem.url);
                        syncItem.finish = z;
                        a.b(a.this);
                        a.b(a.this, false);
                        a.a(a.this);
                    }
                });
            } catch (Throwable th) {
                kmv.a(TAG, "on sync", th, new Object[0]);
            }
        }
    }
}
