package com.taobao.interact.mediaplayer.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.interact.mediaplayer.service.OnCompletionListener;
import com.taobao.interact.mediaplayer.service.OnErrorListener;
import com.taobao.interact.mediaplayer.service.OnPreparedListener;
import tb.kge;

/* loaded from: classes7.dex */
public interface IMediaPlayerService extends IInterface {
    int getCurrentPosition(String str) throws RemoteException;

    int getDuration(String str) throws RemoteException;

    boolean isPausing(String str) throws RemoteException;

    boolean isPlaying(String str) throws RemoteException;

    void pause(String str) throws RemoteException;

    void play(String str, String str2) throws RemoteException;

    void playWithUrl(String str, String str2) throws RemoteException;

    void release(String str) throws RemoteException;

    void reset(String str) throws RemoteException;

    void resume(String str) throws RemoteException;

    void setLooping(boolean z, String str) throws RemoteException;

    void setOnCompletionListener(OnCompletionListener onCompletionListener, String str) throws RemoteException;

    void setOnErrorListener(OnErrorListener onErrorListener, String str) throws RemoteException;

    void setOnPreparedListener(OnPreparedListener onPreparedListener, String str) throws RemoteException;

    void setVolume(float f, float f2, String str) throws RemoteException;

    void stop(String str) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements IMediaPlayerService {
        private static final String DESCRIPTOR = "com.taobao.interact.mediaplayer.service.IMediaPlayerService";
        static final int TRANSACTION_getCurrentPosition = 12;
        static final int TRANSACTION_getDuration = 13;
        static final int TRANSACTION_isPausing = 5;
        static final int TRANSACTION_isPlaying = 8;
        static final int TRANSACTION_pause = 4;
        static final int TRANSACTION_play = 1;
        static final int TRANSACTION_playWithUrl = 2;
        static final int TRANSACTION_release = 7;
        static final int TRANSACTION_reset = 11;
        static final int TRANSACTION_resume = 3;
        static final int TRANSACTION_setLooping = 9;
        static final int TRANSACTION_setOnCompletionListener = 14;
        static final int TRANSACTION_setOnErrorListener = 15;
        static final int TRANSACTION_setOnPreparedListener = 16;
        static final int TRANSACTION_setVolume = 10;
        static final int TRANSACTION_stop = 6;

        static {
            kge.a(-1591890589);
            kge.a(1376492271);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaPlayerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMediaPlayerService)) {
                return (IMediaPlayerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    play(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    playWithUrl(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    resume(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    pause(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isPausing = isPausing(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isPausing ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    stop(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    release(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isPlaying = isPlaying(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isPlaying ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    setLooping(parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolume(parcel.readFloat(), parcel.readFloat(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    reset(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPosition = getCurrentPosition(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPosition);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int duration = getDuration(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(duration);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnCompletionListener(OnCompletionListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnErrorListener(OnErrorListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    setOnPreparedListener(OnPreparedListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements IMediaPlayerService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17596a;

            static {
                kge.a(-461625395);
                kge.a(1376492271);
            }

            Proxy(IBinder iBinder) {
                this.f17596a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17596a;
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void play(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17596a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void playWithUrl(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f17596a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void resume(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void pause(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public boolean isPausing(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f17596a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void stop(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void release(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public boolean isPlaying(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f17596a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void setLooping(boolean z, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str);
                    this.f17596a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void setVolume(float f, float f2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeString(str);
                    this.f17596a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void reset(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public int getCurrentPosition(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public int getDuration(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17596a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void setOnCompletionListener(OnCompletionListener onCompletionListener, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(onCompletionListener != null ? onCompletionListener.asBinder() : null);
                    obtain.writeString(str);
                    this.f17596a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void setOnErrorListener(OnErrorListener onErrorListener, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(onErrorListener != null ? onErrorListener.asBinder() : null);
                    obtain.writeString(str);
                    this.f17596a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.interact.mediaplayer.service.IMediaPlayerService
            public void setOnPreparedListener(OnPreparedListener onPreparedListener, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(onPreparedListener != null ? onPreparedListener.asBinder() : null);
                    obtain.writeString(str);
                    this.f17596a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
