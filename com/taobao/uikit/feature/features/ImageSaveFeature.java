package com.taobao.uikit.feature.features;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
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
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ImageSaveCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.view.TBackFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class ImageSaveFeature extends AbsFeature<ImageView> implements ImageSaveCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;
    private Context mContext;
    private Dialog mDialog;
    private SaveFileTask mSaveFileTask;
    private PointF mStartPoint = new PointF();
    private Bitmap mSaveBmp = null;
    private boolean mActive = false;
    private HashMap<String, ImageSaveFeatureCallback> mChoices = new HashMap<>();

    /* loaded from: classes9.dex */
    public interface ImageSaveFeatureCallback {
        void doMethod(ImageView imageView);
    }

    public static /* synthetic */ Object ipc$super(ImageSaveFeature imageSaveFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((ImageSaveFeature) ((View) objArr[0]));
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

    public static /* synthetic */ void access$000(ImageSaveFeature imageSaveFeature, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df06cf29", new Object[]{imageSaveFeature, imageView});
        } else {
            imageSaveFeature.saveImageView(imageView);
        }
    }

    public static /* synthetic */ void access$100(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6afcf0", new Object[]{imageSaveFeature});
        } else {
            imageSaveFeature.dismissDialog();
        }
    }

    public static /* synthetic */ Context access$300(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b7833f6a", new Object[]{imageSaveFeature}) : imageSaveFeature.mContext;
    }

    public static /* synthetic */ String access$400(ImageSaveFeature imageSaveFeature, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10cea470", new Object[]{imageSaveFeature, new Integer(i)}) : imageSaveFeature.getStringResource(i);
    }

    public static /* synthetic */ boolean access$500(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70422ff8", new Object[]{imageSaveFeature})).booleanValue() : imageSaveFeature.checkSavePlan();
    }

    public static /* synthetic */ void access$600(ImageSaveFeature imageSaveFeature, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c89f932", new Object[]{imageSaveFeature, uri});
        } else {
            imageSaveFeature.notifyNewMedia(uri);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
            return;
        }
        super.setHost((ImageSaveFeature) imageView);
        this.mContext = imageView.getContext();
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.mChoices.put(context.getResources().getString(R.string.uik_save_image), new ImageSaveFeatureCallback() { // from class: com.taobao.uikit.feature.features.ImageSaveFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.feature.features.ImageSaveFeature.ImageSaveFeatureCallback
            public void doMethod(ImageView imageView2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6388dcd", new Object[]{this, imageView2});
                } else {
                    ImageSaveFeature.access$000(ImageSaveFeature.this, imageView2);
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

    public void addDialogChoice(String str, ImageSaveFeatureCallback imageSaveFeatureCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6954b376", new Object[]{this, str, imageSaveFeatureCallback});
        } else {
            this.mChoices.put(str, imageSaveFeatureCallback);
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
                final ImageSaveFeatureCallback imageSaveFeatureCallback = this.mChoices.get(next);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.feature.features.ImageSaveFeature.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        imageSaveFeatureCallback.doMethod(ImageSaveFeature.this.getHost());
                        ImageSaveFeature.access$100(ImageSaveFeature.this);
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

    private void saveImageDirectly(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0aa9b5", new Object[]{this, imageView});
            return;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
            return;
        }
        saveImageFile(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + imageView.toString().hashCode() + ".png")), this.mSaveBmp);
    }

    private TBackFragment getOrCreateResultReceiveFragment() {
        FragmentManager fragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBackFragment) ipChange.ipc$dispatch("ff2327f", new Object[]{this});
        }
        Context context = this.mContext;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) context;
        Activity parent = activity.getParent();
        if (parent != null) {
            fragmentManager = parent.getFragmentManager();
        } else {
            fragmentManager = activity.getFragmentManager();
        }
        TBackFragment tBackFragment = (TBackFragment) fragmentManager.findFragmentByTag("TBackFragment");
        if (tBackFragment != null) {
            return tBackFragment;
        }
        TBackFragment tBackFragment2 = new TBackFragment();
        fragmentManager.beginTransaction().add(tBackFragment2, "TBackFragment").commit();
        fragmentManager.executePendingTransactions();
        return tBackFragment2;
    }

    private void saveImageWithSAF(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27bf7f5", new Object[]{this, imageView});
            return;
        }
        TBackFragment orCreateResultReceiveFragment = getOrCreateResultReceiveFragment();
        if (orCreateResultReceiveFragment == null) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
            return;
        }
        orCreateResultReceiveFragment.setImageSaveFeature(this);
        try {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", imageView.toString().hashCode() + ".png");
            orCreateResultReceiveFragment.startActivityForResult(intent, 1502);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail_multi_boxing), 0).show();
        }
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
        } else if (checkSavePlan()) {
            saveImageDirectly(imageView);
        } else {
            saveImageWithSAF(imageView);
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
        if ((drawable == null && (drawable = imageView.getBackground()) == null) || !(drawable instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
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
            this.mSaveFileTask = new SaveFileTask();
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

    /* loaded from: classes9.dex */
    public class SaveFileTask extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int FAIL_FULL = 2;
        private static final int FAIL_GET = 1;
        private static final int SUCCESS_SAVE = 0;
        private Uri mUri;

        private SaveFileTask() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        /* renamed from: doInBackground */
        public Integer mo1565doInBackground(Object... objArr) {
            ParcelFileDescriptor parcelFileDescriptor;
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("3c207953", new Object[]{this, objArr});
            }
            this.mUri = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    parcelFileDescriptor = ImageSaveFeature.access$300(ImageSaveFeature.this).getContentResolver().openFileDescriptor(this.mUri, "w");
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

        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
                return;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                Toast.makeText(ImageSaveFeature.access$300(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$400(ImageSaveFeature.this, R.string.uik_save_image_success), 0).show();
                if (!ImageSaveFeature.access$500(ImageSaveFeature.this)) {
                    return;
                }
                ImageSaveFeature.access$600(ImageSaveFeature.this, this.mUri);
            } else if (intValue == 1) {
                Toast.makeText(ImageSaveFeature.access$300(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$400(ImageSaveFeature.this, R.string.uik_save_image_fail_get), 0).show();
            } else if (intValue != 2) {
            } else {
                Toast.makeText(ImageSaveFeature.access$300(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$400(ImageSaveFeature.this, R.string.uik_save_image_fail_full), 0).show();
            }
        }
    }
}
