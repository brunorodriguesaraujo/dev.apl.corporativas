package factorystrategy.interfaces

import factorystrategy.model.Samsung

interface CreateDevice {
    fun createDevice(): Samsung
}