package com.ut.share;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareResponse;
import com.ut.share.adapter.ShareShortenAdapter;
import com.ut.share.data.ShareData;
import com.ut.share.executor.ExecutorFactory;
import com.ut.share.executor.IShareExecutor;
import com.ut.share.inter.ShareListener;
import com.ut.share.utils.ShareLinkWrapper;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int RECEIVE_SHORTEN_LINK_FLAG;
    private Context mContext;
    private ShareListener mListener;
    private SharePlatform mPlatform;
    private Handler mReceiveShortUrlHandler;
    private ShareData mShareData;
    private ShareShortenAdapter mShorten;
    private boolean running;

    /* loaded from: classes9.dex */
    public static class Singleton {
        public static ShareApi instance;

        static {
            kge.a(515257972);
            instance = new ShareApi();
        }

        private Singleton() {
        }
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue() : RECEIVE_SHORTEN_LINK_FLAG;
    }

    public static /* synthetic */ Context access$200(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e6a33553", new Object[]{shareApi}) : shareApi.mContext;
    }

    public static /* synthetic */ SharePlatform access$300(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharePlatform) ipChange.ipc$dispatch("729d034b", new Object[]{shareApi}) : shareApi.mPlatform;
    }

    public static /* synthetic */ ShareData access$400(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareData) ipChange.ipc$dispatch("1f058e14", new Object[]{shareApi}) : shareApi.mShareData;
    }

    public static /* synthetic */ ShareListener access$500(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareListener) ipChange.ipc$dispatch("8a56dfbf", new Object[]{shareApi}) : shareApi.mListener;
    }

    public static /* synthetic */ void access$600(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785325d7", new Object[]{shareApi});
        } else {
            shareApi.utProcess();
        }
    }

    public static /* synthetic */ void access$700(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ffd176", new Object[]{shareApi});
        } else {
            shareApi.shortenProcess();
        }
    }

    public static /* synthetic */ ShareShortenAdapter access$800(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareShortenAdapter) ipChange.ipc$dispatch("77fdf3f9", new Object[]{shareApi}) : shareApi.mShorten;
    }

    public static /* synthetic */ Handler access$900(ShareApi shareApi) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("f9244192", new Object[]{shareApi}) : shareApi.mReceiveShortUrlHandler;
    }

    private ShareApi() {
        this.running = false;
    }

    public static ShareApi getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareApi) ipChange.ipc$dispatch("efa29676", new Object[0]) : Singleton.instance;
    }

    public void registerShortenAdapter(ShareShortenAdapter shareShortenAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de8340c", new Object[]{this, shareShortenAdapter});
        } else {
            this.mShorten = shareShortenAdapter;
        }
    }

    public void share(final Context context, final SharePlatform sharePlatform, final ShareData shareData, boolean z, final ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad73719b", new Object[]{this, context, sharePlatform, shareData, new Boolean(z), shareListener});
        } else if (this.running) {
        } else {
            this.running = true;
            this.mContext = context;
            this.mPlatform = sharePlatform;
            this.mShareData = shareData;
            this.mListener = shareListener;
            if (context == null || shareData == null) {
                if (shareListener != null) {
                    ShareResponse shareResponse = new ShareResponse();
                    shareResponse.platform = sharePlatform;
                    shareResponse.errorCode = ShareResponse.ErrorCode.ERR_FAIL;
                    shareListener.onResponse(shareResponse);
                }
                clear();
            } else if (!z) {
                ExecutorFactory.getInstance().findExecutor(sharePlatform).share(context, shareData, shareListener);
                clear();
            } else {
                this.mReceiveShortUrlHandler = new Handler(context.getMainLooper()) { // from class: com.ut.share.ShareApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == 673877017) {
                            super.handleMessage((Message) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        super.handleMessage(message);
                        if (message.what == ShareApi.access$100()) {
                            ExecutorFactory.getInstance().findExecutor(ShareApi.access$300(ShareApi.this)).share(ShareApi.access$200(ShareApi.this), ShareApi.access$300(ShareApi.this), ShareApi.access$400(ShareApi.this), ShareApi.access$500(ShareApi.this));
                        }
                        ShareApi.this.clear();
                    }
                };
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.ut.share.ShareApi.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (ShareApi.access$400(ShareApi.this) == null) {
                        } else {
                            ShareApi.access$600(ShareApi.this);
                            if ((sharePlatform == SharePlatform.Messenger || sharePlatform == SharePlatform.Facebook || sharePlatform == SharePlatform.Instagram || sharePlatform == SharePlatform.Line || sharePlatform == SharePlatform.Telegram || sharePlatform == SharePlatform.WeChat || sharePlatform == SharePlatform.WhatsApp || sharePlatform == SharePlatform.SinaWeibo || sharePlatform == SharePlatform.Copy || sharePlatform == SharePlatform.SMS || sharePlatform == SharePlatform.Weixin || sharePlatform == SharePlatform.WeixinPengyouquan || sharePlatform == SharePlatform.DingTalk) && !TextUtils.isEmpty(shareData.getLink())) {
                                ShareApi.access$700(ShareApi.this);
                                return;
                            }
                            ExecutorFactory.getInstance().findExecutor(sharePlatform).share(context, shareData, shareListener);
                            ShareApi.this.clear();
                        }
                    }
                });
            }
        }
    }

    public void share(Context context, SharePlatform sharePlatform, ShareData shareData, ShareListener shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8b03b", new Object[]{this, context, sharePlatform, shareData, shareListener});
        } else {
            share(context, sharePlatform, shareData, true, shareListener);
        }
    }

    private void utProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edca6357", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mShareData.getLink())) {
        } else {
            this.mShareData.setLink(ShareLinkWrapper.wrapShareLink(this.mShareData.getBusinessId(), this.mPlatform.name(), this.mShareData.getLink()));
        }
    }

    private void shortenProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146ec011", new Object[]{this});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.ut.share.ShareApi.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String shortenURL = ShareApi.access$800(ShareApi.this) != null ? ShareApi.access$800(ShareApi.this).shortenURL(ShareApi.access$400(ShareApi.this).getLink()) : ShareLinkWrapper.shortenURL(ShareApi.access$400(ShareApi.this).getLink());
                    if (!TextUtils.isEmpty(shortenURL)) {
                        ShareApi.access$400(ShareApi.this).setLink(shortenURL);
                    }
                    Message message = new Message();
                    message.what = ShareApi.access$100();
                    ShareApi.access$900(ShareApi.this).sendMessage(message);
                }
            });
        }
    }

    static {
        kge.a(-1900209555);
        RECEIVE_SHORTEN_LINK_FLAG = "receiveWrapLinkFlag".hashCode();
    }

    public boolean canShare(Context context, SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881dd8c5", new Object[]{this, context, sharePlatform})).booleanValue();
        }
        IShareExecutor findExecutor = ExecutorFactory.getInstance().findExecutor(sharePlatform);
        if (findExecutor == null) {
            return false;
        }
        return findExecutor.isAppAvailable(context, sharePlatform);
    }

    public boolean supportImageShare(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e206ad", new Object[]{this, sharePlatform})).booleanValue();
        }
        IShareExecutor findExecutor = ExecutorFactory.getInstance().findExecutor(sharePlatform);
        if (findExecutor == null) {
            return false;
        }
        return findExecutor.supportImageShare();
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.running = false;
        this.mContext = null;
        this.mPlatform = SharePlatform.Other;
        this.mShareData = null;
        this.mListener = null;
    }
}
