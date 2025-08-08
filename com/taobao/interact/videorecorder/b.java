package com.taobao.interact.videorecorder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_UPLOAD_SUCCESS = "sucess_action";
    public static final String ACTION_VIDEO_COMPLETION = "com.qupai.action.ENCODE_COMPLETION";
    public static final String CONFIG_OUTPUT_DIR = "output_dir";
    public static final String CONFIG_UPLOAD = "isNeedUpload";
    public static final String EXTRA_DURATION = "duration";
    public static final String EXTRA_PROGRESS = "progress";
    public static final String EXTRA_VEDIO_COVER_URL = "coverUrl";
    public static final String EXTRA_VEDIO_URL = "videoUrl";
    public static final String EXTRA_VIDEO_PATH = "video";
    public static final String EXTRA_VIDEO_THUMBNAIL = "thumb";
    public static final String VIDEO_URL = "http://m.taobao.com/tqupai.htm";

    /* renamed from: a */
    private a f17634a;
    private Context b;
    private c c = new c();
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.taobao.interact.videorecorder.VideoRecorder$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (StringUtils.equals(action, b.ACTION_VIDEO_COMPLETION)) {
                b.a(b.this).c(intent.getStringExtra("video"));
                b.a(b.this).a(intent.getStringExtra(b.EXTRA_VIDEO_THUMBNAIL));
                b.a(b.this).a(intent.getIntExtra("duration", 0));
            } else if (StringUtils.equals(action, b.ACTION_UPLOAD_SUCCESS)) {
                b.a(b.this).d(intent.getStringExtra("videoUrl"));
                b.a(b.this).b(intent.getStringExtra("coverUrl"));
            }
            b.b(b.this);
            b.a(b.this);
        }
    };

    static {
        kge.a(-341115587);
        kge.a(1614917422);
    }

    public static /* synthetic */ c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5292d7dd", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ a b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6b94293e", new Object[]{bVar}) : bVar.f17634a;
    }

    public b(Context context) {
        this.b = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_VIDEO_COMPLETION);
        intentFilter.addAction(ACTION_UPLOAD_SUCCESS);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.d, intentFilter);
    }
}
