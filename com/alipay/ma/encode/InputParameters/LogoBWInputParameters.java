package com.alipay.ma.encode.InputParameters;

import android.graphics.Bitmap;
import com.alipay.ma.MaLogger;
import com.alipay.ma.encode.ImageHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LogoBWInputParameters extends MaEncodeInputParameters {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LogoBWInputParameters";

    /* renamed from: a  reason: collision with root package name */
    private int f5316a;
    public int logoChannel;
    public byte[] logoData;
    public int logoHeight;
    public int logoSize;
    public int logoWidth;
    public int logoX;
    public int logoY;
    public int margin;
    public int qrcolor;

    @Override // com.alipay.ma.encode.InputParameters.MaEncodeInputParameters
    public boolean isLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public LogoBWInputParameters(String str, Bitmap bitmap, int i, int i2, int i3, char c) {
        this.qrcolor = -16777216;
        this.qrcolor = i;
        this.errorCorrectionLevel = c;
        this.rotation = 0;
        this.qrSize = i3;
        this.version = 4;
        this.type = 4;
        this.margin = i2;
        initializeLogoPictureParameters(bitmap);
        this.publicData = str;
    }

    public LogoBWInputParameters(String str, Bitmap bitmap, int i, int i2, char c) {
        this.qrcolor = -16777216;
        this.errorCorrectionLevel = c;
        this.rotation = 0;
        this.qrSize = i2;
        this.version = 4;
        this.type = 4;
        this.margin = i;
        initializeLogoPictureParameters(bitmap);
        this.publicData = str;
    }

    public LogoBWInputParameters(String str, int i, Bitmap bitmap, int i2, int i3, char c, int i4) {
        this.qrcolor = -16777216;
        this.errorCorrectionLevel = c;
        this.rotation = 0;
        this.qrSize = i3;
        this.version = i4;
        this.type = 4;
        this.margin = i2;
        initializeLogoPictureParameters(bitmap);
        this.publicData = str;
        this.qrcolor = i;
    }

    public LogoBWInputParameters(String str, Bitmap bitmap, int i, int i2, char c, int i3) {
        this.qrcolor = -16777216;
        this.errorCorrectionLevel = c;
        this.rotation = 0;
        this.qrSize = i2;
        this.version = i3;
        this.type = 4;
        this.margin = i;
        initializeLogoPictureParameters(bitmap);
        this.publicData = str;
    }

    public void initializeLogoPictureParameters(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc1c53a", new Object[]{this, bitmap});
            return;
        }
        MaLogger.v(TAG, "Gen3.initializeGen3InputBackgroundPictureParameters");
        try {
            int i = bitmap.hasAlpha() ? 4 : 3;
            this.logoData = ImageHelper.getPixelDataRGB(bitmap, bitmap.getWidth(), bitmap.getHeight(), i);
            MaLogger.v(TAG, "length = " + this.logoData.length);
            this.logoChannel = 3;
            this.logoWidth = bitmap.getWidth();
            this.logoHeight = bitmap.getHeight();
            this.f5316a = bitmap.getWidth() * i;
        } catch (Exception e) {
            MaLogger.v(TAG, e.toString());
        }
    }
}
