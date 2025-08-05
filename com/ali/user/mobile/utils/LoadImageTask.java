package com.ali.user.mobile.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public class LoadImageTask extends AsyncTask<String, Void, Bitmap> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean forceRefreshCache;
    private Context mContext;
    private String mImageUrl;
    private ImageView mImageView;
    private int mLimitSize;
    private ListView mListView;
    private String mTargetDir;
    private boolean mUseCache;
    private View mView;

    static {
        kge.a(-1790117868);
    }

    public static /* synthetic */ Object ipc$super(LoadImageTask loadImageTask, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LoadImageTask(Context context, ImageView imageView, String str, int i) {
        this.mLimitSize = 160;
        this.forceRefreshCache = false;
        this.mUseCache = false;
        this.mContext = context;
        this.mImageView = imageView;
        this.mTargetDir = str;
        this.mLimitSize = i;
    }

    public LoadImageTask(Context context, View view, String str, int i) {
        this.mLimitSize = 160;
        this.forceRefreshCache = false;
        this.mUseCache = false;
        this.mContext = context;
        this.mView = view;
        this.mTargetDir = str;
        this.mLimitSize = i;
    }

    public LoadImageTask(Context context, ListView listView, String str, int i, boolean z, boolean z2) {
        this.mLimitSize = 160;
        this.forceRefreshCache = false;
        this.mUseCache = false;
        this.mContext = context;
        this.mListView = listView;
        this.mTargetDir = str;
        this.mLimitSize = i;
        this.forceRefreshCache = z;
        this.mUseCache = z2;
    }

    @Override // android.os.AsyncTask
    public Bitmap doInBackground(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("661fa7f8", new Object[]{this, strArr});
        }
        this.mImageUrl = strArr[0];
        return loadImage(this.mImageUrl);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Bitmap bitmap) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
        } else if (bitmap == null) {
        } else {
            View view = this.mView;
            if (view != null) {
                view.setBackground(new BitmapDrawable(bitmap));
            }
            ImageView imageView2 = this.mImageView;
            if (imageView2 != null) {
                imageView2.setImageBitmap(bitmap);
            }
            ListView listView = this.mListView;
            if (listView == null || (imageView = (ImageView) listView.findViewWithTag(this.mImageUrl)) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    private Bitmap loadImage(String str) {
        Bitmap decodeSampledBitmapFromResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6fb15dc4", new Object[]{this, str});
        }
        File file = new File(getImagePath(str));
        if (!file.exists() || (this.forceRefreshCache && LoginSwitch.getSwitch("forceRefresgCache", "false"))) {
            downloadImage(str);
        }
        if (str == null || (decodeSampledBitmapFromResource = ImageUtil.decodeSampledBitmapFromResource(file.getAbsolutePath(), this.mLimitSize)) == null) {
            return null;
        }
        LoginSwitch.getSwitch("addBitmap", "true");
        return decodeSampledBitmapFromResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0 A[Catch: IOException -> 0x00ec, TRY_LEAVE, TryCatch #10 {IOException -> 0x00ec, blocks: (B:84:0x00e8, B:88:0x00f0, B:96:0x0107, B:90:0x00f5, B:92:0x00fb), top: B:116:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5 A[Catch: Throwable -> 0x0103, TRY_ENTER, TryCatch #10 {IOException -> 0x00ec, blocks: (B:84:0x00e8, B:88:0x00f0, B:96:0x0107, B:90:0x00f5, B:92:0x00fb), top: B:116:0x00e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void downloadImage(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.LoadImageTask.downloadImage(java.lang.String):void");
    }

    private String getImagePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9705d85", new Object[]{this, str});
        }
        String str2 = this.mContext.getCacheDir().getPath() + "/" + this.mTargetDir + "/";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2 + MD5Util.getMD5(str);
    }

    public static void rmImagePath(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddb05e6", new Object[]{context, str});
        } else if (context == null) {
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                File file = new File(context.getCacheDir().getPath() + "/" + str + "/");
                if (!file.exists()) {
                    return;
                }
                file.delete();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
