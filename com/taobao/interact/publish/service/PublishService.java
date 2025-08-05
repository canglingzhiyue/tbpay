package com.taobao.interact.publish.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;
import com.taobao.android.tao.pissarro.WrapperPissarroService;
import com.taobao.interact.publish.bean.ImageSnapshot;
import com.taobao.interact.publish.service.IPublishService;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.lya;
import tb.lyb;

/* loaded from: classes7.dex */
public class PublishService extends Service implements com.taobao.android.pissarro.external.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_POSTURE_KEY = "enable_posture";
    public static final String GROUP_NAME = "ocean";
    private IServiceCallBack b;
    private ImageResultReceiver c;
    private com.taobao.android.pissarro.external.c d;
    private boolean f;
    private Config e = Config.createDefault();

    /* renamed from: a  reason: collision with root package name */
    public IPublishService.Stub f17610a = new IPublishService.Stub() { // from class: com.taobao.interact.publish.service.PublishService.1
        @Override // com.taobao.interact.publish.service.IPublishService
        public void registerCallback(IServiceCallBack iServiceCallBack) throws RemoteException {
            PublishService.a(PublishService.this, iServiceCallBack);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void callGallery() throws RemoteException {
            PublishService.b(PublishService.this).openAlbum(PublishService.a(PublishService.this), PublishService.this);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void callCamera() throws RemoteException {
            PublishService.b(PublishService.this).openCamera(PublishService.a(PublishService.this), PublishService.this);
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void initConfig(PublishConfig publishConfig) throws RemoteException {
            PublishService publishService = PublishService.this;
            PublishService.a(publishService, PublishService.a(publishService, publishConfig));
            com.taobao.android.pissarro.c.a().a(PublishService.a(PublishService.this));
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void editImage(String str, PublishConfig publishConfig) throws RemoteException {
            initConfig(publishConfig);
            PublishService.b(PublishService.this).editPicture(PublishService.a(PublishService.this), str, PublishService.this);
            lyb.a("editImage");
        }

        @Override // com.taobao.interact.publish.service.IPublishService
        public void showChoiceDialog() throws RemoteException {
            PublishService.b(PublishService.this).openCameraOrAlbum(PublishService.a(PublishService.this), PublishService.this);
            lyb.a("showChoiceDialog");
        }
    };

    /* loaded from: classes7.dex */
    public class ImageResultReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ImageResultReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            lyb.a("image_snapshot");
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("KEY_IMAGESNAPSHOT");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                ImageSnapshot imageSnapshot = (ImageSnapshot) it.next();
                Image image = new Image();
                image.setPath(imageSnapshot.getPath());
                image.setCoverPath(imageSnapshot.getThumbnails());
                arrayList.add(image);
            }
            try {
                if (PublishService.c(PublishService.this) == null) {
                    return;
                }
                PublishService.c(PublishService.this).onResult(arrayList);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(PublishService publishService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1992651935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    public static /* synthetic */ Config a(PublishService publishService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("87d53631", new Object[]{publishService}) : publishService.e;
    }

    public static /* synthetic */ Config a(PublishService publishService, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("baea0b9f", new Object[]{publishService, config});
        }
        publishService.e = config;
        return config;
    }

    public static /* synthetic */ Config a(PublishService publishService, PublishConfig publishConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("4820c33f", new Object[]{publishService, publishConfig}) : publishService.a(publishConfig);
    }

    public static /* synthetic */ IServiceCallBack a(PublishService publishService, IServiceCallBack iServiceCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IServiceCallBack) ipChange.ipc$dispatch("d7a3bc65", new Object[]{publishService, iServiceCallBack});
        }
        publishService.b = iServiceCallBack;
        return iServiceCallBack;
    }

    public static /* synthetic */ com.taobao.android.pissarro.external.c b(PublishService publishService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.pissarro.external.c) ipChange.ipc$dispatch("b1bccbff", new Object[]{publishService}) : publishService.d;
    }

    public static /* synthetic */ IServiceCallBack c(PublishService publishService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IServiceCallBack) ipChange.ipc$dispatch("127ff441", new Object[]{publishService}) : publishService.b;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        if (!a()) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            builder.setPriority(-2);
            startForeground(100, builder.build());
        }
        this.c = new ImageResultReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.interact.publish.action.IMAGE_RESULT");
        registerReceiver(this.c, intentFilter);
        this.d = new WrapperPissarroService(this);
        this.f = "true".equals(OrangeConfig.getInstance().getConfig(GROUP_NAME, ENABLE_POSTURE_KEY, "true"));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 24;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.b = null;
        ImageResultReceiver imageResultReceiver = this.c;
        if (imageResultReceiver != null) {
            unregisterReceiver(imageResultReceiver);
        }
        if (!a()) {
            stopForeground(true);
        }
        super.onDestroy();
        com.taobao.android.pissarro.external.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.onDestory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue() : super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.f17610a;
    }

    @Override // com.taobao.android.pissarro.external.a
    public void onComplete(List<com.taobao.android.pissarro.external.Image> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef32bb0", new Object[]{this, list});
        } else if (this.b != null) {
            ArrayList arrayList = new ArrayList();
            for (com.taobao.android.pissarro.external.Image image : list) {
                Image image2 = new Image();
                image2.setPath(image.getPath());
                image2.setCoverPath(image.getCoverPath());
                image2.setMediaType(image.getMediaType());
                image2.setResourceUrl(image.getResourceUrl());
                image2.setCoverUrl(image.getCoverUrl());
                image2.setWidth(image.getWidth());
                image2.setHeight(image.getHeight());
                image2.setDuration(image.getDuration());
                image2.setFileId(image.getFileId());
                arrayList.add(image2);
            }
            try {
                this.b.onResult(arrayList);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.android.pissarro.external.a
    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
        } else {
            lya.b();
        }
    }

    private Config a(PublishConfig publishConfig) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("57d48008", new Object[]{this, publishConfig});
        }
        Config.a aVar = new Config.a();
        Config.a g = aVar.e(publishConfig.getBizLine()).d(publishConfig.getBizScene()).b(publishConfig.getMode()).a(publishConfig.getFinishButtonText()).f(publishConfig.getVideoBizCode()).a(publishConfig.getMaxVideoDuration()).b(publishConfig.getMaxVideoSize()).h(publishConfig.getMaxImageSize()).c(publishConfig.getMediaType()).b(publishConfig.isAutoUpload()).a(publishConfig.isUseNewUi()).g(publishConfig.isMultiable()).c(publishConfig.getMaxMultiCount()).d(publishConfig.isRequestCrop()).e(publishConfig.isRequestFilter()).f(publishConfig.isRequestSticker()).d(publishConfig.getMaxStickerCount()).h(publishConfig.isRequestGraffiti()).i(publishConfig.isRequestMosaic()).f(publishConfig.getFacing()).g(publishConfig.getBizCode());
        if (!publishConfig.isEnablePosture() || !this.f || !lya.a()) {
            z = false;
        }
        g.j(z).g(publishConfig.getWindowMode());
        if (publishConfig.isRequestOriginal()) {
            aVar.e(2);
        } else {
            aVar.e(0);
        }
        AspectRatio aspectRatio = publishConfig.getAspectRatio();
        if (aspectRatio != null) {
            aVar.a(new com.taobao.android.pissarro.external.AspectRatio(aspectRatio.getAspectRatioX(), aspectRatio.getAspectRatioY()));
        }
        BitmapSize targetSize = publishConfig.getTargetSize();
        if (targetSize != null) {
            aVar.a(new com.taobao.android.pissarro.external.BitmapSize(targetSize.getWidth(), targetSize.getHeight()));
        }
        return aVar.a();
    }
}
