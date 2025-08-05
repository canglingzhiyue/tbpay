package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.k;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.taopassword.b;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.SharePlatform;
import com.ut.share.ShareResponse;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.Constants;
import com.ut.share.utils.ShareUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.obi;

/* loaded from: classes8.dex */
public class oik implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ShareListener f32091a = new ShareListener() { // from class: tb.oik.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.share.inter.ShareListener
        public void onResponse(ShareResponse shareResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5dc66e8", new Object[]{this, shareResponse});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("platform", b.a(shareResponse.platform).getValue());
            int i = AnonymousClass4.f32095a[shareResponse.errorCode.ordinal()];
            if (i == 1) {
                return;
            }
            if (i == 2) {
                oik.a(oik.this, shareResponse);
                str = "success";
            } else if (i != 3) {
                if (i == 4) {
                    oik.b(oik.this, shareResponse);
                    hashMap.put(a.RESULT_KEY, "fail");
                    hashMap.put("errorMessage", shareResponse.errorMessage);
                }
                ShareBusiness.getInstance().onShareFinished(hashMap);
            } else {
                oik.a(oik.this);
                str = "cancel";
            }
            hashMap.put(a.RESULT_KEY, str);
            ShareBusiness.getInstance().onShareFinished(hashMap);
        }
    };

    /* renamed from: tb.oik$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32095a = new int[ShareResponse.ErrorCode.values().length];

        static {
            try {
                f32095a[ShareResponse.ErrorCode.ERR_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32095a[ShareResponse.ErrorCode.ERR_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32095a[ShareResponse.ErrorCode.ERR_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32095a[ShareResponse.ErrorCode.ERR_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1519989335);
        kge.a(-2068678803);
    }

    public static /* synthetic */ void a(oik oikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f82367", new Object[]{oikVar});
        } else {
            oikVar.a();
        }
    }

    public static /* synthetic */ void a(oik oikVar, ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f89be88", new Object[]{oikVar, shareResponse});
        } else {
            oikVar.a(shareResponse);
        }
    }

    public static /* synthetic */ void a(oik oikVar, ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3e884e", new Object[]{oikVar, shareData, str});
        } else {
            oikVar.b(shareData, str);
        }
    }

    public static /* synthetic */ boolean a(oik oikVar, SuccPhenixEvent succPhenixEvent, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3fde3f6", new Object[]{oikVar, succPhenixEvent, str, shareData})).booleanValue() : oikVar.a(succPhenixEvent, str, shareData);
    }

    public static /* synthetic */ void b(oik oikVar, ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29e989", new Object[]{oikVar, shareResponse});
        } else {
            oikVar.b(shareResponse);
        }
    }

    @Override // tb.oiq
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        TBShareContent j = e.b().j();
        ShareData shareData = new ShareData();
        shareData.setBusinessId(j.businessId);
        shareData.setTitle(j.title);
        if (j.extraParams != null && !TextUtils.isEmpty(j.extraParams.get("bizType"))) {
            shareData.setBizType(j.extraParams.get("bizType"));
        }
        shareData.setText(j.description);
        shareData.setSourceType(j.shareScene);
        if (!TextUtils.isEmpty(j.imgPath)) {
            shareData.setImagePath(j.imgPath);
            j.imageUrl = j.imgPath;
            shareData.setSourceType("");
            shareData.setType(ShareData.MessageType.IMAGE);
        } else {
            shareData.setLink(j.url);
        }
        shareData.setUserInfo(j.activityParams);
        if (!TextUtils.isEmpty(j.imageUrl)) {
            if (j.imageUrl.startsWith(k.HTTP_PREFIX) || j.imageUrl.startsWith(k.HTTPS_PREFIX)) {
                shareData.setImageUrl(j.imageUrl);
            } else {
                shareData.setImagePath(j.imageUrl);
            }
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            String f = obi.b.f();
            if (TextUtils.isEmpty(f)) {
                f = nym.a().getString(R.string.share_weibo_default_image);
            }
            j.imageUrl = f;
            shareData.setImageUrl(j.imageUrl);
        }
        a(j, shareData, str);
    }

    private void a(TBShareContent tBShareContent, ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa1b4f0", new Object[]{this, tBShareContent, shareData, str});
            return;
        }
        b.a(str);
        if (ShareTargetType.Share2Wangxin.getValue().equals(str) && (shareData.getType() == ShareData.MessageType.TEXT || TextUtils.equals("item", e.b().c()))) {
            shareData.setText(shareData.getLink());
            shareData.setImagePath(null);
            shareData.setImageUrl(null);
            shareData.setLink(null);
            shareData.setTitle(null);
            shareData.setType(ShareData.MessageType.TEXT);
        }
        if (a(shareData, str)) {
            return;
        }
        b.a(nym.a().getApplicationContext(), str, shareData, this.f32091a);
    }

    private boolean a(ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a3dc131", new Object[]{this, shareData, str})).booleanValue();
        }
        SharePlatform b = b.b(str);
        if (SharePlatform.Other.equals(b) || !ShareApi.getInstance().supportImageShare(b) || !TextUtils.isEmpty(shareData.getImagePath()) || TextUtils.isEmpty(shareData.getImageUrl())) {
            return false;
        }
        if (ShareTargetType.Share2SinaWeibo.getValue().equals(str) || ShareTargetType.Share2Weixin.getValue().equals(str) || ShareTargetType.Share2WeixinTimeline.getValue().equals(str)) {
            a(str, shareData);
        } else {
            String decideUrl = ImageStrategyDecider.decideUrl(shareData.getImageUrl(), 100, 100, ImageStrategyConfig.a("default", 67).a());
            if (!TextUtils.isEmpty(decideUrl)) {
                shareData.setImageUrl(decideUrl);
            }
            a(str, shareData);
        }
        return true;
    }

    private void a(final String str, final ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40da699", new Object[]{this, str, shareData});
        } else {
            com.taobao.phenix.intf.b.h().a(nym.a().getApplicationContext()).a(shareData.getImageUrl()).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.oik.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue() : oik.a(oik.this, succPhenixEvent, str, shareData);
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.oik.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    oik.a(oik.this, shareData, str);
                    return false;
                }
            }).fetch();
        }
    }

    private boolean a(SuccPhenixEvent succPhenixEvent, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9826e95", new Object[]{this, succPhenixEvent, str, shareData})).booleanValue();
        }
        if (succPhenixEvent.getDrawable() != null && succPhenixEvent.getDrawable().getBitmap() != null) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = null;
                Context applicationContext = nym.a().getApplicationContext();
                if (Build.VERSION.SDK_INT > 18 && applicationContext.getExternalCacheDirs().length > 0) {
                    file = applicationContext.getExternalCacheDirs()[0];
                } else if (applicationContext.getExternalCacheDir() != null) {
                    file = applicationContext.getExternalCacheDir();
                }
                Bitmap drawWaterMark = BitmapUtil.drawWaterMark(succPhenixEvent.getDrawable().getBitmap());
                if (file != null && ShareUtils.saveBitmap(drawWaterMark, file, Constants.SHARE_IMAGE_FILE_NAME, Bitmap.CompressFormat.JPEG)) {
                    shareData.setImagePath(file + "/" + Constants.SHARE_IMAGE_FILE_NAME);
                }
            }
            b(shareData, str);
        }
        return true;
    }

    private void b(ShareData shareData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88165b8c", new Object[]{this, shareData, str});
        } else {
            b.a(nym.a().getApplicationContext(), str, shareData, this.f32091a);
        }
    }

    private void a(ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88766c09", new Object[]{this, shareResponse});
        } else if (shareResponse != null && shareResponse.platform != null && (shareResponse.platform == SharePlatform.Messenger || shareResponse.platform == SharePlatform.Facebook || shareResponse.platform == SharePlatform.Instagram || shareResponse.platform == SharePlatform.Line || shareResponse.platform == SharePlatform.Telegram || shareResponse.platform == SharePlatform.WeChat || shareResponse.platform == SharePlatform.WhatsApp)) {
        } else {
            Toast.makeText(nym.a().getApplicationContext(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17872), 0).show();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Toast.makeText(nym.a().getApplicationContext(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17842), 0).show();
        }
    }

    private void b(ShareResponse shareResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e280a", new Object[]{this, shareResponse});
        } else {
            Toast.makeText(nym.a().getApplicationContext(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17832), 0).show();
        }
    }
}
