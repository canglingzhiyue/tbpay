package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.cache.a;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.d;
import android.taobao.windvane.util.m;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.CameraActivity;
import com.taobao.browser.jsbridge.ui.chooseImg.ImgFileListActivity;
import com.taobao.browser.utils.BrowserUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class WVCameraPlus extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_CAMERA = 4003;
    private static final int REQUEST_CHOOSE_PHOTO = 4004;
    private static final String TAG = "WVCameraPlus";
    private WVCallBackContext mCallback = null;
    private String mPath = "";
    private String mParams = "";

    static {
        kge.a(-1164063103);
    }

    public static /* synthetic */ Object ipc$super(WVCameraPlus wVCameraPlus, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"takePhotoPlus".equals(str)) {
            return false;
        }
        BrowserUtil.a(TAG, BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        takePhotoPlus(wVCallBackContext, str2);
        return true;
    }

    public void takePhotoPlus(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f53bef3", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!(this.mContext.getPackageManager().checkPermission(com.taobao.speech.util.e.CAMERA, this.mContext.getPackageName()) == 0)) {
            if (this.mCallback == null) {
                return;
            }
            r rVar = new r();
            rVar.a("msg", "NO_PERMISSON");
            this.mCallback.error(rVar);
            return;
        }
        this.mParams = str;
        Intent intent = new Intent();
        this.mCallback = wVCallBackContext;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optString("mode", BlobManager.BLOB_ELEM_TYPE_CAMERA).equals(BlobManager.BLOB_ELEM_TYPE_CAMERA)) {
                this.mPath = a.a().a(true) + File.separator + d.a(str2);
                jSONObject.put("localUrl", "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis());
                String optString = jSONObject.optString(CameraActivity.CAMERA_TYPE);
                String optString2 = jSONObject.optString("maskImg");
                String optString3 = jSONObject.optString(CameraActivity.MASK_WIDTH);
                String optString4 = jSONObject.optString(CameraActivity.MASK_HEIGHT);
                intent.setClass(this.mContext, CameraActivity.class);
                intent.putExtra(CameraActivity.CAMERA_TYPE, optString);
                intent.putExtra(CameraActivity.MASK_URL, optString2);
                intent.putExtra(CameraActivity.MASK_WIDTH, optString3);
                intent.putExtra(CameraActivity.MASK_HEIGHT, optString4);
                intent.putExtra("path", this.mPath);
                this.mParams = jSONObject.toString();
                ((Activity) this.mContext).startActivityForResult(intent, 4003);
            } else if (jSONObject.optInt("mutipleSelection", 0) != 0) {
                intent.setClass(this.mContext, ImgFileListActivity.class);
                ((Activity) this.mContext).startActivityForResult(intent, 4004);
            } else {
                throw new Exception();
            }
        } catch (Exception unused) {
            m.e(TAG, "takePhotoPlus fail, params: " + str);
            r rVar2 = new r();
            rVar2.a("HY_PARAM_ERR");
            this.mCallback.error(rVar2);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (m.a()) {
            m.b(TAG, "takePhoto callback, requestCode: " + i + ";resultCode: " + i2);
        }
        if (i == 4003) {
            if (i2 == -1) {
                WVCamera wVCamera = new WVCamera();
                wVCamera.initialize(this.mContext, this.mWebView);
                wVCamera.takePhotoPlus(this.mCallback, this.mPath, this.mParams);
                return;
            }
            m.d(TAG, "call takePhotoInteract fail. resultCode: " + i2);
            this.mCallback.error(new r());
        } else if (i == 4004) {
            if (i2 == -1) {
                ArrayList arrayList = (ArrayList) intent.getExtras().get("fileList");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    WVCamera wVCamera2 = new WVCamera();
                    wVCamera2.initialize(this.mContext, this.mWebView);
                    String str = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                    this.mPath = a.a().a(true) + File.separator + d.a(str);
                    copyfile(new File((String) arrayList.get(i3)), new File(this.mPath), true);
                    try {
                        JSONObject jSONObject = new JSONObject(this.mParams);
                        jSONObject.put("localUrl", str);
                        wVCamera2.takePhotoPlus(this.mCallback, this.mPath, jSONObject.toString());
                    } catch (Exception unused) {
                        m.d(TAG, "call takePhoto fail. params error : " + this.mParams);
                        this.mCallback.error();
                        return;
                    }
                }
                m.a(TAG, intent.getExtras().get("fileList").toString());
                return;
            }
            m.d(TAG, "call takePhoto fail. resultCode: " + i2);
            this.mCallback.error();
        }
    }

    private void copyfile(File file, File file2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e56867", new Object[]{this, file, file2, bool});
        } else if (!file.exists() || !file.isFile() || !file.canRead()) {
        } else {
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (file2.exists() && bool.booleanValue()) {
                file2.delete();
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
