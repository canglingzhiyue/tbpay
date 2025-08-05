package com.taobao.android.interactive_sdk.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.grz;

@Deprecated
/* loaded from: classes5.dex */
public class ShortVideoDownloader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ILLEGAL_TASK_ID = -1;

    /* renamed from: a  reason: collision with root package name */
    private static final ShortVideoDownloader f12957a = new ShortVideoDownloader();
    private final Map<Long, DownloadReceiver> b = new ConcurrentHashMap();

    /* loaded from: classes5.dex */
    public static class Error implements Serializable {
        public final int errorCode;
        public final String msg;

        public Error(int i, String str) {
            this.errorCode = i;
            this.msg = str;
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a(long j, int i);

        void a(long j, Error error);
    }

    /* loaded from: classes5.dex */
    public static class DownloadReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f12958a;
        private final a b;

        private DownloadReceiver(long j, a aVar) {
            this.f12958a = j;
            this.b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (context == null || intent == null) {
            } else {
                String action = intent.getAction();
                long longExtra = intent.getLongExtra("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_VIDEO_ID", 0L);
                if (longExtra == 0 || longExtra != this.f12958a) {
                    return;
                }
                if ("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_PROGRESS".equals(action)) {
                    int intExtra = intent.getIntExtra("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_PROGRESS", -1);
                    if (intExtra < 0) {
                        return;
                    }
                    this.b.a(longExtra, intExtra);
                } else if (!"com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_FINISH".equals(action)) {
                } else {
                    this.b.a(longExtra, (Error) intent.getSerializableExtra("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.EXTRA_ERROR"));
                }
            }
        }
    }

    private ShortVideoDownloader() {
    }

    public static ShortVideoDownloader a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShortVideoDownloader) ipChange.ipc$dispatch("7057eb74", new Object[0]) : f12957a;
    }

    public void a(long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eb6c5", new Object[]{this, new Long(j), aVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_PROGRESS");
        intentFilter.addAction("com.taobao.android.interactive_sdk.downloader.ShortVideoDownloader.ACTION_DOWNLOAD_FINISH");
        DownloadReceiver downloadReceiver = new DownloadReceiver(j, aVar);
        this.b.put(Long.valueOf(j), downloadReceiver);
        LocalBroadcastManager.getInstance(grz.a()).registerReceiver(downloadReceiver, intentFilter);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            LocalBroadcastManager.getInstance(grz.a()).unregisterReceiver(this.b.get(Long.valueOf(j)));
        }
    }
}
