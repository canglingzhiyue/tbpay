package com.taobao.bootimage;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.data.SplashInteractData;
import com.taobao.bootimage.infochooser.b;
import java.lang.ref.WeakReference;
import java.util.Properties;
import tb.kej;
import tb.kem;
import tb.ker;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static SplashInteractData c;

    /* renamed from: a  reason: collision with root package name */
    public String f16647a;
    public BootImageInfo b;
    public ImageInfoStatus d = ImageInfoStatus.IDLE;
    public a e;
    public WeakReference<Activity> f;
    private boolean g;
    private boolean h;
    private b i;

    /* loaded from: classes6.dex */
    public enum ImageInfoStatus {
        IDLE,
        PENDING,
        READING,
        INVALID
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(ImageInfoStatus imageInfoStatus);
    }

    static {
        kge.a(1771774351);
    }

    public static /* synthetic */ void a(BootImageInfoManager bootImageInfoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe9372a", new Object[]{bootImageInfoManager});
        } else {
            bootImageInfoManager.e();
        }
    }

    public static /* synthetic */ void a(BootImageInfoManager bootImageInfoManager, ImageInfoStatus imageInfoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dca8691", new Object[]{bootImageInfoManager, imageInfoStatus});
        } else {
            bootImageInfoManager.a(imageInfoStatus);
        }
    }

    public BootImageInfoManager(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d != ImageInfoStatus.IDLE || this.d == ImageInfoStatus.INVALID || d()) {
        } else {
            kej.a(kem.TAG, "updateImageInfo start");
            c = null;
            if (!this.g && kem.a().i()) {
                final com.taobao.bootimage.infochooser.c cVar = new com.taobao.bootimage.infochooser.c(this.g, this.f16647a);
                if (cVar.d()) {
                    kej.a(kem.TAG, "chooseInteractSplashInfo start");
                    a(ImageInfoStatus.PENDING);
                    cVar.a(new b.a() { // from class: com.taobao.bootimage.BootImageInfoManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.bootimage.infochooser.b.a
                        public void a(BootImageInfo bootImageInfo, int i, String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("74395dbf", new Object[]{this, bootImageInfo, new Integer(i), str});
                                return;
                            }
                            if (i == 0 && bootImageInfo != null) {
                                SplashInteractData a2 = cVar.a();
                                BootImageInfoManager.c = a2;
                                if (a2 != null) {
                                    BootImageInfoManager bootImageInfoManager = BootImageInfoManager.this;
                                    bootImageInfoManager.b = bootImageInfo;
                                    BootImageInfoManager.a(bootImageInfoManager, ImageInfoStatus.READING);
                                    return;
                                }
                            }
                            BootImageInfoManager.a(BootImageInfoManager.this, ImageInfoStatus.INVALID);
                        }
                    });
                    if (this.d == ImageInfoStatus.READING) {
                        this.i = cVar;
                        return;
                    }
                }
            }
            if (this.g || kem.a().a("brandEnabled")) {
                kej.a(kem.TAG, "updateImageInfo brand is enabled");
                com.taobao.bootimage.infochooser.a aVar = new com.taobao.bootimage.infochooser.a(this.g);
                aVar.f16686a = this.f16647a;
                this.i = aVar;
                if (((com.taobao.bootimage.infochooser.a) this.i).a()) {
                    kej.a(kem.TAG, "updateImageInfo brand is valid");
                    a(ImageInfoStatus.PENDING);
                    this.i.a(new b.a() { // from class: com.taobao.bootimage.BootImageInfoManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.bootimage.infochooser.b.a
                        public void a(BootImageInfo bootImageInfo, int i, String str) {
                            String str2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("74395dbf", new Object[]{this, bootImageInfo, new Integer(i), str});
                                return;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("brand chooseInfo result code:");
                            sb.append(i);
                            sb.append(",msg:");
                            sb.append(str);
                            if (bootImageInfo != null) {
                                str2 = ",infoItemId：" + bootImageInfo.itemId + ",bizeType：" + bootImageInfo.bizType;
                            } else {
                                str2 = "";
                            }
                            sb.append(str2);
                            kej.a(kem.TAG, sb.toString());
                            if (!kem.a().a("brandEnabled") || i != 0) {
                                kej.a(kem.TAG, "updateImageInfo brand un enabled");
                                BootImageInfoManager.a(BootImageInfoManager.this);
                                return;
                            }
                            kej.a(kem.TAG, "updateImageInfo brand is enabled22");
                            BootImageInfoManager bootImageInfoManager = BootImageInfoManager.this;
                            bootImageInfoManager.b = bootImageInfo;
                            BootImageInfoManager.a(bootImageInfoManager, ImageInfoStatus.READING);
                        }
                    });
                    return;
                }
                kej.a(kem.TAG, "本地没有合适的 brandImageInfo");
                e();
                return;
            }
            e();
            kej.a(kem.TAG, "updateImageInfo brand is invalid");
        }
    }

    private boolean d() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        kej.a("BootImageInfoManager", "updateLinkedSplashInfo start");
        boolean a2 = com.taobao.bootimage.linked.h.a(this.f16647a).a();
        WeakReference<Activity> weakReference = this.f;
        if (weakReference != null && ((activity = weakReference.get()) == null || !ker.b(activity))) {
            return false;
        }
        if (this.g || !a2) {
            kej.a("BootImageInfoManager", "Cannot update linked splash info. Is cold start: " + this.g + ". Is new linked splash enabled: " + a2);
            return false;
        }
        com.taobao.bootimage.infochooser.d dVar = new com.taobao.bootimage.infochooser.d(false, this.f16647a, this.h);
        if (dVar.a()) {
            kej.a("BootImageInfoManager", "choose LinkedSplashInfo info start");
            a(ImageInfoStatus.PENDING);
            dVar.a(new b.a() { // from class: com.taobao.bootimage.BootImageInfoManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.bootimage.infochooser.b.a
                public void a(BootImageInfo bootImageInfo, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("74395dbf", new Object[]{this, bootImageInfo, new Integer(i), str});
                    } else if (bootImageInfo == null || i != 0) {
                        BootImageInfoManager.a(BootImageInfoManager.this, ImageInfoStatus.INVALID);
                        kej.a("BootImageInfoManager", "onChooseInfo result. code:" + i + ",msg:" + str);
                    } else {
                        BootImageInfoManager bootImageInfoManager = BootImageInfoManager.this;
                        bootImageInfoManager.b = bootImageInfo;
                        BootImageInfoManager.a(bootImageInfoManager, ImageInfoStatus.READING);
                        kej.a("BootImageInfoManager", "onChooseInfo result. code:" + i + ",msg:" + str + ",itemId:" + bootImageInfo.itemId + ",bizeType" + bootImageInfo.bizType);
                    }
                }
            });
            if (this.d == ImageInfoStatus.READING) {
                this.i = dVar;
                return true;
            }
            kej.a("BootImageInfoManager", "updateLinkedSplashInfo, end false, mImageInfoStatus not ready");
        } else {
            kej.a("BootImageInfoManager", "updateLinkedSplashInfo, end false, do not have LinkedSplash");
        }
        return false;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "chooseNormalInfo start");
        a(ImageInfoStatus.PENDING);
        com.taobao.bootimage.infochooser.e eVar = new com.taobao.bootimage.infochooser.e(this.g);
        eVar.f16690a = this.f16647a;
        this.i = eVar;
        this.i.a(new b.a() { // from class: com.taobao.bootimage.BootImageInfoManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.infochooser.b.a
            public void a(BootImageInfo bootImageInfo, int i, String str) {
                StringBuilder sb;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74395dbf", new Object[]{this, bootImageInfo, new Integer(i), str});
                    return;
                }
                if (bootImageInfo != null) {
                    sb = new StringBuilder();
                    sb.append("normal chooseInfo result code:");
                    sb.append(i);
                    sb.append(",msg:");
                    sb.append(str);
                    sb.append(",infoItemId：");
                    sb.append(bootImageInfo.itemId);
                    sb.append(",bizeType：");
                    str = bootImageInfo.bizType;
                } else {
                    sb = new StringBuilder();
                    sb.append("normal chooseInfo result code:");
                    sb.append(i);
                    sb.append(",msg:");
                }
                sb.append(str);
                kej.a(kem.TAG, sb.toString());
                BootImageInfoManager bootImageInfoManager = BootImageInfoManager.this;
                bootImageInfoManager.b = bootImageInfo;
                BootImageInfoManager.a(bootImageInfoManager, i == 0 ? ImageInfoStatus.READING : ImageInfoStatus.INVALID);
            }
        });
    }

    private void a(ImageInfoStatus imageInfoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86d7293", new Object[]{this, imageInfoStatus});
        } else if (this.d == imageInfoStatus) {
        } else {
            this.d = imageInfoStatus;
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.a(this.d);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    public Properties c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("ec83bba8", new Object[]{this});
        }
        b bVar = this.i;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }
}
