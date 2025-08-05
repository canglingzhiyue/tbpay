package com.taobao.taobao.scancode.encode.aidlservice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.IEncodeService;
import com.taobao.taobao.scancode.gateway.util.o;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import tb.kge;
import tb.oyi;
import tb.oyj;
import tb.oys;

/* loaded from: classes8.dex */
public class BusinessBinder extends IEncodeService.Stub {
    private static final int qrColor = -16777216;

    static {
        kge.a(65534294);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encode(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) throws RemoteException {
        o.a("call:encode api :imageUrl" + str + "\ntext:" + str2 + "\nmaType: " + i + "\nmaSizeType:" + maSizeType.x + "," + maSizeType.y + "\nneedToShortURL:" + z, new Object[0]);
        new com.taobao.taobao.scancode.encode.api.a().a(str, str2, i, maSizeType, z, encodeCallback);
        oys.a().a("Encode_Aidl_encode");
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encodeMa2(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback) throws RemoteException {
        encodeMa3(i, bArr, i2, i3, str, i4, i5, i6, c, i7, encodeCallback, -16777216);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void encodeMa3(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) throws RemoteException {
        o.a("call:encodeMa3 api :type" + i + "\nlogoWidth:" + i2 + "\nlogoHeight: " + i3 + "\ncontent:" + str + "\nlogoChannel:" + i4 + "\n_margin:" + i5 + "\n_qrSize:" + i6 + "\necl:" + c + "\nversion:" + i7 + "\n_qrColor:" + i8, new Object[0]);
        if (i != 1) {
            encodeCallback.onError(new EncodeError(i, "no impl"));
        } else if (bArr != null && str != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outHeight = i3;
            options.outWidth = i2;
            encodeCallback.onSuccess(new BitmapHolder(oyj.a(str, i8, BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), i5, i6, c, i7 <= 0 ? 4 : i7)));
        } else {
            encodeCallback.onError(new EncodeError(i, "logoData=null"));
        }
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public String decodeLocalPath(String str) {
        return decodeLocalPathWithType(str, 36607);
    }

    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public String decodeLocalPathWithType(String str, int i) {
        oys.a().a("Encode_Aidl_decode_from_local");
        MaResult a2 = oyi.a(str, i, (Context) null);
        if (a2 == null || a2.getText() == null) {
            return null;
        }
        return a2.getText();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.taobao.scancode.encode.aidlservice.BusinessBinder$1] */
    @Override // com.taobao.taobao.scancode.encode.aidlservice.IEncodeService
    public void decodeBitmap(byte[] bArr, final int i, final DecodeCallback decodeCallback) throws RemoteException {
        oys.a().a("Encode_Aidl_decode_bitmap");
        if (decodeCallback == null) {
            return;
        }
        if (bArr == null) {
            decodeCallback.onError(new EncodeError(i, "imageData==null"));
            return;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            decodeCallback.onError(new EncodeError(i, "imageBitmap==null"));
        } else {
            new AsyncTask<Bitmap, Void, MaResult>() { // from class: com.taobao.taobao.scancode.encode.aidlservice.BusinessBinder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public MaResult f21232a;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.taobao.scancode.v2.result.MaResult] */
                @Override // android.os.AsyncTask
                public /* synthetic */ MaResult doInBackground(Bitmap[] bitmapArr) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, bitmapArr}) : a(bitmapArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(MaResult maResult) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b105c779", new Object[]{this, maResult});
                    } else {
                        a(maResult);
                    }
                }

                public MaResult a(Bitmap... bitmapArr) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (MaResult) ipChange.ipc$dispatch("8f75d10b", new Object[]{this, bitmapArr});
                    }
                    MaType maType = MaType.QR;
                    int i2 = i;
                    if (i2 == 0) {
                        maType = MaType.PRODUCT;
                    } else if (i2 == 1) {
                        this.f21232a = oyi.a(bitmapArr[0], MaType.QR, MaType.GEN3);
                        return this.f21232a;
                    } else if (i2 == 2) {
                        maType = MaType.EXPRESS;
                    }
                    this.f21232a = oyi.a(bitmapArr[0], maType);
                    return this.f21232a;
                }

                public void a(MaResult maResult) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("e04fadd2", new Object[]{this, maResult});
                    } else if (maResult != null && maResult.getText() != null) {
                        try {
                            if (decodeCallback instanceof GEN3DecodeCallback) {
                                ((GEN3DecodeCallback) decodeCallback).a(maResult.getType().getDiscernType());
                            }
                            decodeCallback.onSuccess(maResult.getText());
                        } catch (RemoteException unused) {
                        }
                    } else {
                        try {
                            decodeCallback.onError(new EncodeError(i, "masult == null"));
                        } catch (RemoteException unused2) {
                        }
                    }
                }
            }.execute(decodeByteArray);
        }
    }
}
