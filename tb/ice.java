package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.c;
import com.taobao.taopai.business.image.external.AspectRatio;
import com.taobao.taopai.business.image.external.BitmapSize;
import com.taobao.taopai.business.image.external.Config;
import mtopsdk.mtop.upload.domain.UploadConstants;

/* loaded from: classes6.dex */
public class ice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310516072);
    }

    public static Config a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("2bc0a734", new Object[0]);
        }
        com.taobao.android.pissarro.external.Config b = c.a().b();
        Config.a d = new Config.a().b(b.getBizCode()).a(b.isEnableClip()).b(b.isEnableFilter()).d(b.isMultiple());
        if (b.isMultiple() && ich.a()) {
            z = true;
        }
        BitmapSize bitmapSize = null;
        Config.a a2 = d.g(z).f(b.isEnableMosaic()).e(b.isEnableGraffiti()).c(b.isEnableSticker()).j(b.isEnablePosture()).a(b.getStickerIds()).i(b.isSupportGif()).c(b.getMaxStickerCount()).a(b.getMaxSelectCount()).d(b.getDefinitionMode()).f(b.getWindowMode()).e(b.getFacing()).a(b.getAspectRatio() != null ? new AspectRatio(b.getAspectRatio().getAspectRatioX(), b.getAspectRatio().getAspectRatioY()) : null);
        if (b.getBitmapSize() != null) {
            bitmapSize = new BitmapSize(b.getBitmapSize().getWidth(), b.getBitmapSize().getHeight());
        }
        return a2.a(bitmapSize).a();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        com.taobao.android.pissarro.external.Config b = c.a().b();
        String str = "1";
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/image_gallery.html").appendQueryParameter("requestCode", "2").appendQueryParameter("scene", b.isUseNewUi() ? "selectGallery" : "selectGalleryImage").appendQueryParameter("sync_upload", b.isAutoUpload() ? str : "0").appendQueryParameter("use_message_ui", b.isUseNewUi() ? str : "0").appendQueryParameter(UploadConstants.BIZ_CODE, b.getVideoBizCode()).appendQueryParameter("finish_button_text", b.getFinishButtonText()).appendQueryParameter("image_edit_enable", (b.isEnableClip() || b.isEnableGraffiti() || b.isEnableMosaic() || b.isEnableSticker()) ? str : "0").appendQueryParameter("image_sticker_enable", b.isEnableSticker() ? str : "0").appendQueryParameter("image_cut_enable", b.isEnableClip() ? str : "0").appendQueryParameter("image_mosaic_enable", b.isEnableMosaic() ? str : "0");
        if (!b.isEnableGraffiti()) {
            str = "0";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("image_graffiti_enable", str).appendQueryParameter("photo_max", String.valueOf(b.getMaxSelectCount())).appendQueryParameter("img_bizcode", b.getBizCode());
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("max_import_video_size", b.getMaxVideoSize() + "");
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("max_import_video_duration", b.getMaxVideoDuration() + "").appendQueryParameter(ios.KEY_MEDIA_TYPE, b.getMediaType());
        return appendQueryParameter4.appendQueryParameter("image_max_size", b.getMaxImageSize() + "").appendQueryParameter(ios.KEY_BIZ_LINE, b.getBizLine()).appendQueryParameter("biz_scene", TextUtils.isEmpty(b.getBizScene()) ? "pissarro" : b.getBizScene()).build().toString();
    }
}
