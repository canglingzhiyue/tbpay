package com.taobao.android.interactive_common.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ImageSaveCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class LocalImageSaveFeature extends AbsFeature<ImageView> implements ImageSaveCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FAIL_FULL = 2;
    private static final int FAIL_GET = 1;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;
    private static final int SUCCESS_SAVE = 0;
    private Context mContext;
    private Dialog mDialog;
    private c mSaveFileTask;
    private d mSaveFileUseMediaStoreTask;
    private Bitmap mWaterMarkBitmap;
    private String mWaterMarkIconUrl;
    private String mWaterMarkText;
    private PointF mStartPoint = new PointF();
    private Bitmap mSaveBmp = null;
    private boolean mActive = false;
    private HashMap<String, b> mChoices = new HashMap<>();

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, Bitmap bitmap);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(ImageView imageView);
    }

    public static /* synthetic */ Object ipc$super(LocalImageSaveFeature localImageSaveFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((LocalImageSaveFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ImageSaveCallback
    public void afterPerformLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6816ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public static /* synthetic */ String access$000(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c43ea3ad", new Object[]{localImageSaveFeature}) : localImageSaveFeature.mWaterMarkIconUrl;
    }

    public static /* synthetic */ Bitmap access$102(LocalImageSaveFeature localImageSaveFeature, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("54ffcef6", new Object[]{localImageSaveFeature, bitmap});
        }
        localImageSaveFeature.mWaterMarkBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$200(LocalImageSaveFeature localImageSaveFeature, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48aeacf", new Object[]{localImageSaveFeature, imageView});
        } else {
            localImageSaveFeature.saveImageView(imageView);
        }
    }

    public static /* synthetic */ void access$300(LocalImageSaveFeature localImageSaveFeature, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d41b5f", new Object[]{localImageSaveFeature, str, aVar});
        } else {
            localImageSaveFeature.fetchImage(str, aVar);
        }
    }

    public static /* synthetic */ void access$400(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36115d57", new Object[]{localImageSaveFeature});
        } else {
            localImageSaveFeature.dismissDialog();
        }
    }

    public static /* synthetic */ Context access$700(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3aa68352", new Object[]{localImageSaveFeature}) : localImageSaveFeature.mContext;
    }

    public static /* synthetic */ void access$800(LocalImageSaveFeature localImageSaveFeature, Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41ea4a9", new Object[]{localImageSaveFeature, num, uri, new Boolean(z)});
        } else {
            localImageSaveFeature.handleSaveResult(num, uri, z);
        }
    }

    public void setWater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be088ef0", new Object[]{this, str, str2});
            return;
        }
        this.mWaterMarkText = str;
        this.mWaterMarkIconUrl = str2;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
            return;
        }
        super.setHost((LocalImageSaveFeature) imageView);
        this.mContext = imageView.getContext();
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.mChoices.put(context.getResources().getString(R.string.uik_save_image), new b() { // from class: com.taobao.android.interactive_common.view.LocalImageSaveFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.interactive_common.view.LocalImageSaveFeature.b
            public void a(final ImageView imageView2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("83f7c622", new Object[]{this, imageView2});
                } else if (TextUtils.isEmpty(LocalImageSaveFeature.access$000(LocalImageSaveFeature.this))) {
                    LocalImageSaveFeature.access$200(LocalImageSaveFeature.this, imageView2);
                } else {
                    LocalImageSaveFeature localImageSaveFeature = LocalImageSaveFeature.this;
                    LocalImageSaveFeature.access$300(localImageSaveFeature, LocalImageSaveFeature.access$000(localImageSaveFeature), new a() { // from class: com.taobao.android.interactive_common.view.LocalImageSaveFeature.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.interactive_common.view.LocalImageSaveFeature.a
                        public void a(String str, Bitmap bitmap) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("c58b8a3c", new Object[]{this, str, bitmap});
                                return;
                            }
                            LocalImageSaveFeature.access$102(LocalImageSaveFeature.this, bitmap);
                            LocalImageSaveFeature.access$200(LocalImageSaveFeature.this, imageView2);
                        }
                    });
                }
            }
        });
    }

    @Override // com.taobao.uikit.feature.callback.ImageSaveCallback
    public void beforePerformLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec17f731", new Object[]{this});
        } else if (!this.mActive) {
        } else {
            showDialog();
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mStartPoint.set(motionEvent.getX(), motionEvent.getY());
            this.mActive = true;
        } else if (action != 2) {
            if (action != 5) {
                return;
            }
            this.mActive = false;
            dismissDialog();
        } else {
            float x = motionEvent.getX() - this.mStartPoint.x;
            float y = motionEvent.getY() - this.mStartPoint.y;
            if (Math.abs(x) <= 10.0f && Math.abs(y) <= 10.0f) {
                return;
            }
            this.mActive = false;
            dismissDialog();
        }
    }

    public void addDialogChoice(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1606f9", new Object[]{this, str, bVar});
        } else {
            this.mChoices.put(str, bVar);
        }
    }

    private void showDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
        } else if (this.mChoices.size() <= 0) {
        } else {
            Context context = this.mContext;
            if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            this.mDialog = new Dialog(this.mContext, R.style.uik_imagesavedialog);
            LayoutInflater layoutInflater = (LayoutInflater) this.mContext.getSystemService("layout_inflater");
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.uik_image_save_dialog, (ViewGroup) null);
            Iterator<String> it = this.mChoices.keySet().iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) layoutInflater.inflate(R.layout.uik_image_save_choice, (ViewGroup) linearLayout, false);
                String next = it.next();
                textView.setText(next);
                final b bVar = this.mChoices.get(next);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.interactive_common.view.LocalImageSaveFeature.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        bVar.a(LocalImageSaveFeature.this.getHost());
                        LocalImageSaveFeature.access$400(LocalImageSaveFeature.this);
                    }
                });
                linearLayout.addView(textView);
                if (it.hasNext()) {
                    linearLayout.addView(layoutInflater.inflate(R.layout.uik_choice_divider, (ViewGroup) linearLayout, false));
                }
            }
            this.mDialog.setContentView(linearLayout);
            this.mDialog.show();
        }
    }

    private void dismissDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        Dialog dialog = this.mDialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.mDialog.dismiss();
        this.mDialog = null;
    }

    private boolean useMediaStore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e604ecf", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 29;
    }

    private void saveImageView(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88993e4", new Object[]{this, imageView});
            return;
        }
        this.mSaveBmp = getBitmap(imageView);
        if (this.mSaveBmp == null) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail_get), 0).show();
        } else if (useMediaStore()) {
            if (this.mSaveFileUseMediaStoreTask != null && AsyncTask.Status.RUNNING == this.mSaveFileUseMediaStoreTask.getStatus()) {
                return;
            }
            this.mSaveFileUseMediaStoreTask = new d();
            this.mSaveFileUseMediaStoreTask.execute(this.mSaveBmp);
        } else if (checkSavePlan()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
                return;
            }
            saveImageFile(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + imageView.toString().hashCode() + ".png")), this.mSaveBmp);
        } else {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", imageView.toString().hashCode() + ".png");
            Context context = this.mContext;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context != null && (context instanceof Activity)) {
                FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
                LocalTBackFragment localTBackFragment = (LocalTBackFragment) fragmentManager.findFragmentByTag("LocalTBackFragment");
                if (localTBackFragment == null) {
                    localTBackFragment = new LocalTBackFragment();
                    fragmentManager.beginTransaction().add(localTBackFragment, "LocalTBackFragment").commit();
                    fragmentManager.executePendingTransactions();
                }
                localTBackFragment.a(this);
                localTBackFragment.startActivityForResult(intent, 1502);
                return;
            }
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
        }
    }

    private boolean checkSavePlan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74f98f9", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        return Build.VERSION.SDK_INT <= 28 && this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private Bitmap getBitmap(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd1167c4", new Object[]{this, imageView});
        }
        Drawable drawable = imageView.getDrawable();
        Bitmap bitmap = null;
        if (drawable == null && (drawable = imageView.getBackground()) == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        return (this.mWaterMarkBitmap == null && this.mWaterMarkText == null) ? bitmap : createWaterMaskBitmap(bitmap);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i != 1502 || i2 != -1) {
        } else {
            saveImageFile(intent.getData(), this.mSaveBmp);
        }
    }

    public void saveImageFile(Uri uri, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fda0188", new Object[]{this, uri, bitmap});
        } else if (this.mSaveFileTask != null && AsyncTask.Status.RUNNING == this.mSaveFileTask.getStatus()) {
        } else {
            this.mSaveFileTask = new c();
            this.mSaveFileTask.execute(uri, bitmap);
        }
    }

    private void notifyNewMedia(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd519d33", new Object[]{this, uri});
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        this.mContext.sendBroadcast(intent);
    }

    private String getStringResource(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab3e0739", new Object[]{this, new Integer(i)}) : this.mContext.getResources().getString(i);
    }

    /* loaded from: classes5.dex */
    public class c extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Uri b;

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Integer doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, num});
            } else {
                a(num);
            }
        }

        private c() {
        }

        public Integer a(Object... objArr) {
            ParcelFileDescriptor parcelFileDescriptor;
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("41f654b0", new Object[]{this, objArr});
            }
            this.b = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    parcelFileDescriptor = LocalImageSaveFeature.access$700(LocalImageSaveFeature.this).getContentResolver().openFileDescriptor(this.b, "w");
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                            try {
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                try {
                                    fileOutputStream2.flush();
                                    fileOutputStream2.close();
                                    if (parcelFileDescriptor != null) {
                                        parcelFileDescriptor.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                i = 0;
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                return Integer.valueOf(i);
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        throw th;
                                    }
                                }
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    parcelFileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }

        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            } else {
                LocalImageSaveFeature.access$800(LocalImageSaveFeature.this, num, this.b, true);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class d extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Uri b;

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Integer] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Integer doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, num});
            } else {
                a(num);
            }
        }

        private d() {
        }

        public Integer a(Object... objArr) {
            OutputStream openOutputStream;
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("41f654b0", new Object[]{this, objArr});
            }
            Bitmap bitmap = (Bitmap) objArr[0];
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("_display_name", Integer.valueOf(bitmap.toString().hashCode()));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            contentValues.put("date_added", Long.valueOf(valueOf.longValue() / 1000));
            contentValues.put("date_modified", Long.valueOf(valueOf.longValue() / 1000));
            contentValues.put("date_expires", Long.valueOf((valueOf.longValue() + 86400000) / 1000));
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = LocalImageSaveFeature.access$700(LocalImageSaveFeature.this).getContentResolver();
            this.b = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                openOutputStream = contentResolver.openOutputStream(this.b);
            } catch (IOException unused) {
                contentResolver.delete(this.b, null, null);
            }
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream)) {
                throw new IOException("Failed to compress");
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentValues.putNull("date_expires");
            contentResolver.update(this.b, contentValues, null, null);
            i = 0;
            return Integer.valueOf(i);
        }

        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            } else {
                LocalImageSaveFeature.access$800(LocalImageSaveFeature.this, num, this.b, false);
            }
        }
    }

    private void handleSaveResult(Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b9bafb", new Object[]{this, num, uri, new Boolean(z)});
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            Toast.makeText(this.mContext.getApplicationContext(), "图片已保存，请在手机相册中查看", 0).show();
            if (z && !checkSavePlan()) {
                return;
            }
            notifyNewMedia(uri);
        } else if (intValue == 1) {
            Toast.makeText(this.mContext.getApplicationContext(), "存储失败", 0).show();
        } else if (intValue != 2) {
        } else {
            Toast.makeText(this.mContext.getApplicationContext(), "存储失败，可能存储空间不足", 0).show();
        }
    }

    private void fetchImage(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30556651", new Object[]{this, str, aVar});
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.interactive_common.view.LocalImageSaveFeature.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null) {
                        aVar.a(str, drawable.getBitmap());
                    } else {
                        aVar.a(str, null);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.interactive_common.view.LocalImageSaveFeature.3
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
                    aVar.a(str, null);
                    return true;
                }
            }).fetch();
        }
    }

    private Bitmap createWaterMaskBitmap(Bitmap bitmap) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d7cda40f", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Bitmap bitmap2 = this.mWaterMarkBitmap;
        if (bitmap2 != null) {
            int width2 = bitmap2.getWidth();
            int height2 = this.mWaterMarkBitmap.getHeight();
            Rect rect = new Rect(0, 0, width2, height2);
            int size2 = getSize(width, 38);
            if (height2 != 0) {
                size = (width2 * size2) / height2;
            } else {
                size = getSize(width, 160);
            }
            Rect rect2 = new Rect((width - size) - getSize(width, 20), (height - size2) - getSize(width, 53), width - getSize(width, 20), height - getSize(width, 53));
            Paint paint = new Paint(1);
            paint.setShadowLayer(getSize(width, 1), 0.0f, getSize(width, 1), 2130706432);
            canvas.drawBitmap(this.mWaterMarkBitmap, rect, rect2, paint);
        }
        if (!TextUtils.isEmpty(this.mWaterMarkText)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-460552);
            textPaint.setTextSize(getSize(width, 20));
            textPaint.setShadowLayer(getSize(width, 1), 0.0f, getSize(width, 1), 2130706432);
            canvas.drawText(this.mWaterMarkText, (width - getSize(width, 20)) - textPaint.measureText(this.mWaterMarkText), (height - getSize(width, 48)) - textPaint.getFontMetrics().top, textPaint);
        }
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    private static int getSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c49b251", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i2 * i) / 750;
    }
}
