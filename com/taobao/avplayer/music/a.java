package com.taobao.avplayer.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.music.BackgroundAudioService;
import com.taobao.avplayer.n;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    public ServiceConnectionC0635a f16534a;
    public BackgroundAudioService.MusicBinder b;
    private Context d;
    private n e;
    private b f;
    private String g;

    static {
        kge.a(-835285964);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe8793d8", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772b7192", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ec328cf", new Object[]{aVar, str});
        }
        aVar.g = str;
        return str;
    }

    public BackgroundAudioService.MusicBinder a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BackgroundAudioService.MusicBinder) ipChange.ipc$dispatch("9b654055", new Object[]{this}) : this.b;
    }

    /* renamed from: com.taobao.avplayer.music.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class ServiceConnectionC0635a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-848759202);
            kge.a(808545181);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }

        public ServiceConnectionC0635a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "MusicServiceConnection onServiceConnected start");
            a aVar = a.this;
            aVar.b = (BackgroundAudioService.MusicBinder) iBinder;
            if (a.a(aVar) != null) {
                a aVar2 = a.this;
                a.a(aVar2, a.a(aVar2));
                a.b(a.this, null);
            }
            AVSDKLog.e("AVSDK-tb-Music", "MusicServiceConnection onServiceConnected finish");
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        Intent intent = new Intent(this.d, BackgroundAudioService.class);
        this.f16534a = new ServiceConnectionC0635a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.d.startForegroundService(intent);
        } else {
            this.d.startService(intent);
        }
        this.d.bindService(intent, this.f16534a, 1);
    }

    private a(Context context) {
        this.d = context;
        AVSDKLog.e("AVSDK-tb-Music", "BackgroundAudioPlayerManager init");
        q();
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("33ae5840", new Object[]{context});
        }
        if (c == null) {
            c = new a(context);
        }
        return c;
    }

    public boolean a(n nVar, n.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee3c006f", new Object[]{this, nVar, aVar})).booleanValue();
        }
        if (this.e != null || nVar == null) {
            return false;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + "BackgroundAudioPlayerManager attach " + nVar);
        this.e = nVar;
        this.f = aVar;
        return true;
    }

    public boolean a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a932e35", new Object[]{this, nVar})).booleanValue();
        }
        if (nVar != null && nVar != this.e) {
            return false;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + "BackgroundAudioPlayerManager detach " + nVar);
        if (a() != null) {
            a().onStop();
        }
        this.e = null;
        this.f = null;
        this.g = null;
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        String videoUrl = bVar.i().mPlayContext.getVideoUrl();
        if (a() != null) {
            a(videoUrl);
        } else {
            this.g = videoUrl;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a().onPlayFromMediaId(str, null);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f == null) {
        } else {
            a().onPlay();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null) {
        } else {
            a().onPause();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f == null) {
        } else {
            a().onClose();
        }
    }

    public HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar == null) {
            return null;
        }
        return bVar.i().mMetaData;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        b bVar = this.f;
        if (bVar == null) {
            return false;
        }
        return bVar.i().mCanShowPreviousNextButton;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3f40f684", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public Bitmap g() {
        Bitmap a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4535e4c", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar == null) {
            return null;
        }
        Bitmap bitmap = bVar.i().mAlbumArtBitamp;
        if (bitmap == null || ((bitmap.getHeight() <= 128 && bitmap.getWidth() <= 128) || (a2 = a(bitmap, 128, 128)) == null)) {
            return bitmap;
        }
        this.f.i().mAlbumArtBitamp = a2;
        return a2;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f == null) {
        } else {
            a().onCustomAction("updateAlbumArtBitmap", null);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.g();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.c();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.f();
    }

    public void a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621735b", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.a(i, z, z2);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.d();
    }
}
