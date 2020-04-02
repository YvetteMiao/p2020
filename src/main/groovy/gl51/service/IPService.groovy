package gl51.service

import gl51.data.Ip

interface IPService {
    /**
     * prendre une IP
     * @return
     */
    Ip fetchIp()
}