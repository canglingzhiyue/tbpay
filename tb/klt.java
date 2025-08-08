package tb;

import android.app.DownloadManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.io.File;

/* loaded from: classes7.dex */
public class klt implements kln {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long b;
    private ContentObserver c;
    private klo d;
    private kmr e;

    /* renamed from: a  reason: collision with root package name */
    private static DownloadManager f30142a = (DownloadManager) a.c.getSystemService("download");
    public static final Uri CONTENT_URI = Uri.parse("content://downloads/my_downloads");

    public static /* synthetic */ void a(klt kltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1531ec5", new Object[]{kltVar});
        } else {
            kltVar.d();
        }
    }

    @Override // tb.kln
    public void a(kmr kmrVar, klo kloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8619a0a", new Object[]{this, kmrVar, kloVar});
            return;
        }
        this.d = kloVar;
        this.e = kmrVar;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(kmrVar.e.f30167a));
        int i = (kmrVar.f.d & 2) == 2 ? 1 : 0;
        if ((kmrVar.f.d & 1) == 1 || (kmrVar.f.d & 4) == 4) {
            i |= 2;
        }
        request.setAllowedNetworkTypes(i);
        if ((kmrVar.f.d & 4) != 4 && Build.VERSION.SDK_INT > 16) {
            request.setAllowedOverMetered(false);
        }
        if (!StringUtils.isEmpty(kmrVar.f.k)) {
            request.setTitle(kmrVar.f.k);
            request.setDescription(kmrVar.f.l);
        }
        String a2 = kmrVar.a();
        request.setDestinationUri(Uri.fromFile(new File(kmrVar.g + "/" + a2)));
        kmr kmrVar2 = this.e;
        kmrVar2.d = kmrVar.g + "/" + a2;
        if (!kmrVar.f.m) {
            request.setVisibleInDownloadsUi(false);
            if (c()) {
                request.setNotificationVisibility(2);
            }
        } else {
            request.setNotificationVisibility(this.e.f.p);
        }
        if (!a(kmrVar.e.b)) {
            kmrVar.f30170a = false;
            kmrVar.b = -21;
            kmrVar.c = "手机剩余空间不足";
            kmrVar.f.r = 0;
            kmrVar.f.e = 0;
            this.d.a(kmrVar);
            return;
        }
        this.b = f30142a.enqueue(request);
        this.c = new ContentObserver(null) { // from class: tb.klt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                } else {
                    klt.a(klt.this);
                }
            }
        };
        a.c.getContentResolver().registerContentObserver(CONTENT_URI, true, this.c);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a.c.checkCallingOrSelfPermission("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0;
    }

    @Override // tb.kln
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f30142a.remove(this.b);
        e();
    }

    @Override // tb.kln
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b <= 0) {
        } else {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(this.b);
            Cursor query2 = f30142a.query(query);
            if (query2 == null || !query2.moveToFirst()) {
                return;
            }
            int i = query2.getInt(query2.getColumnIndex("status"));
            int columnIndex = query2.getColumnIndex("reason");
            int columnIndex2 = query2.getColumnIndex("title");
            int columnIndex3 = query2.getColumnIndex("total_size");
            int columnIndex4 = query2.getColumnIndex("bytes_so_far");
            String string = query2.getString(columnIndex2);
            int i2 = query2.getInt(columnIndex3);
            int i3 = query2.getInt(columnIndex4);
            query2.getInt(columnIndex);
            this.d.a(i3, this.e.e.f30167a);
            kmv.a("DMDownloader", "queryDownloadStatus", "tag", string + "\nDownloaded " + i3 + " / " + i2);
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                return;
                            }
                            kmv.a("DMDownloader", "queryDownloadStatus", "STATUS_FAILED");
                            return;
                        }
                        String string2 = query2.getString(query2.getColumnIndex("local_filename"));
                        if (!StringUtils.isEmpty(string2)) {
                            this.e.d = string2;
                        }
                        kmr kmrVar = this.e;
                        kmrVar.f30170a = true;
                        this.d.a(kmrVar);
                        e();
                        return;
                    }
                    kmv.a("DMDownloader", "queryDownloadStatus", "STATUS_PAUSED");
                }
                kmv.a("DMDownloader", "queryDownloadStatus", "STATUS_RUNNING");
            }
            kmv.a("DMDownloader", "queryDownloadStatus", "STATUS_PENDING");
            kmv.a("DMDownloader", "queryDownloadStatus", "STATUS_RUNNING");
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c == null) {
        } else {
            a.c.getContentResolver().unregisterContentObserver(this.c);
        }
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : Environment.getExternalStorageDirectory().getFreeSpace() >= j;
    }
}
