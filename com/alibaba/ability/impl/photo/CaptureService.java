package com.alibaba.ability.impl.photo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.aln;
import tb.amg;
import tb.hsy;
import tb.kge;

/* loaded from: classes2.dex */
public final class CaptureService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, aln> f1931a;

    /* loaded from: classes2.dex */
    public static final class b implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ aln b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ MediaProjection d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ boolean f;

        /* renamed from: com.alibaba.ability.impl.photo.CaptureService$b$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ImageReader b;

            public AnonymousClass1(ImageReader imageReader) {
                this.b = imageReader;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, android.hardware.display.VirtualDisplay] */
            /* JADX WARN: Type inference failed for: r0v8, types: [T, android.hardware.display.VirtualDisplay] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.photo.CaptureService.b.AnonymousClass1.run():void");
            }
        }

        public b(aln alnVar, Ref.ObjectRef objectRef, MediaProjection mediaProjection, Context context, boolean z) {
            this.b = alnVar;
            this.c = objectRef;
            this.d = mediaProjection;
            this.e = context;
            this.f = z;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            Log.e(amg.MODULE_NAME, "setOnImageAvailableListener");
            e.a(new AnonymousClass1(imageReader), 500L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediaProjection b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ aln d;

        public c(MediaProjection mediaProjection, Ref.ObjectRef objectRef, aln alnVar) {
            this.b = mediaProjection;
            this.c = objectRef;
            this.d = alnVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, android.hardware.display.VirtualDisplay] */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MediaProjection mediaProjection = this.b;
                if (mediaProjection != null) {
                    mediaProjection.stop();
                }
            } catch (Exception unused) {
            }
            VirtualDisplay virtualDisplay = (VirtualDisplay) this.c.element;
            if (virtualDisplay == null) {
                return;
            }
            virtualDisplay.release();
            this.c.element = (VirtualDisplay) 0;
            CaptureService.this.stopForeground(true);
            aln alnVar = this.d;
            if (alnVar == null) {
                return;
            }
            alnVar.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_CAPTURE_ERROR, "screen capture timeout", (Map) null, 4, (o) null));
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureService captureService, String str, Object... objArr) {
        if (str.hashCode() == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public static final /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]) : f1931a;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1910231523);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a(Intent intent, Context context, aln alnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a884a30", new Object[]{this, intent, context, alnVar});
                return;
            }
            q.d(intent, "intent");
            q.d(context, "context");
            String uuid = UUID.randomUUID().toString();
            q.b(uuid, "UUID.randomUUID().toString()");
            CaptureService.b().put(uuid, alnVar);
            intent.putExtra("cb_uuid", uuid);
            context.startForegroundService(intent);
        }

        @JvmStatic
        public final void b(Intent intent, Context context, aln abilityCallBack) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ec6b9cf", new Object[]{this, intent, context, abilityCallBack});
                return;
            }
            q.d(intent, "intent");
            q.d(context, "context");
            q.d(abilityCallBack, "abilityCallBack");
            String uuid = UUID.randomUUID().toString();
            q.b(uuid, "UUID.randomUUID().toString()");
            CaptureService.b().put(uuid, abilityCallBack);
            intent.putExtra("cb_uuid", uuid);
            context.startService(intent);
        }
    }

    static {
        kge.a(760011029);
        Companion = new a(null);
        f1931a = new HashMap<>();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        Intent intent2 = null;
        aln alnVar = null;
        if (intent != null && (stringExtra = intent.getStringExtra("cb_uuid")) != null) {
            alnVar = f1931a.remove(stringExtra);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                a();
            } catch (Throwable th) {
                if (alnVar != null) {
                    alnVar.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_CAPTURE_ERROR, "start foreground service error = " + th, (Map) null, 4, (o) null));
                }
                return super.onStartCommand(intent, i, i2);
            }
        }
        Intent intent3 = intent != null ? (Intent) intent.getParcelableExtra("data") : null;
        if (intent3 instanceof Intent) {
            intent2 = intent3;
        }
        if (intent != null) {
            z = intent.getBooleanExtra(com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && intent2 != null) {
            try {
                Object systemService = getSystemService("media_projection");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                }
                MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(-1, intent2);
                Context applicationContext = getApplicationContext();
                q.b(applicationContext, "applicationContext");
                a(mediaProjection, applicationContext, alnVar, z);
            } catch (Throwable th2) {
                stopForeground(true);
                TLog.loge(amg.MODULE_NAME, amg.MODULE_NAME, "parse screen capture Data error " + th2);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
            ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("mega_screen_capture", "mega_screen_capture", 2));
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "mega_screen_capture");
        builder.setContentText("").setWhen(System.currentTimeMillis()).setSmallIcon(17629184);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("mega_screen_capture");
        }
        startForeground(110, builder.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(MediaProjection mediaProjection, Context ctx, aln alnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d984af8", new Object[]{this, mediaProjection, ctx, alnVar, new Boolean(z)});
            return;
        }
        q.d(ctx, "ctx");
        int i = hsy.a(ctx).widthPixels;
        int i2 = hsy.a(ctx).heightPixels;
        ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 1);
        q.b(newInstance, "ImageReader.newInstance(…at.RGBA_8888, 1\n        )");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        VirtualDisplay virtualDisplay = null;
        if (mediaProjection != null) {
            try {
                Resources system = Resources.getSystem();
                q.b(system, "Resources.getSystem()");
                virtualDisplay = mediaProjection.createVirtualDisplay("screen-capture", i, i2, system.getDisplayMetrics().densityDpi, 16, newInstance.getSurface(), null, null);
            } catch (Throwable th) {
                stopForeground(true);
                if (alnVar != null) {
                    alnVar.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_CAPTURE_ERROR, "create virtual display error = " + th, (Map) null, 4, (o) null));
                }
                TLog.loge(amg.MODULE_NAME, "ImageAbility", "createVirtualDisplay error = " + th);
            }
        }
        T t = virtualDisplay;
        if (t == 0) {
            return;
        }
        objectRef.element = t;
        newInstance.setOnImageAvailableListener(new b(alnVar, objectRef, mediaProjection, ctx, z), new Handler(Looper.getMainLooper()));
        e.a(new c(mediaProjection, objectRef, alnVar), 1000L);
    }
}
