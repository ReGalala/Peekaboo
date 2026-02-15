# PEƎKABOO
![Project Logo](app-code/peekApp/src/main/resources/image/logo.png)
<!-- Readme guide: https://www.makeareadme.com/ -->

Peekaboo is a smart mirror system designed to support everyday routines by displaying contextual information directly in the bathroom environment.

The system combines IoT hardware with a desktop application to present real-time data such as temperature, humidity, weather forecasts, reminders, and room occupancy. Motion detection automatically activates the mirror when someone enters the room, helping users stay informed without interacting with traditional devices.

Peekaboo was developed as a team project in the university course *Mini Project: System Development*, with focus on embedded systems, IoT communication, and user-centered design.

---

## Tech Stack

- **Embedded Device:** Wio Terminal (Arduino)
- **Desktop Application:** Java (JavaFX)
- **Messaging:** MQTT (HiveMQ)
- **Sensors:** Temperature, humidity, motion
- **Hardware Components:** LED strip, LCD display
- **Architecture:** IoT client + desktop client communicating via MQTT

---

## System Overview

Peekaboo consists of two main components:

### Smart Mirror (Wio Terminal)
- Collects sensor data  
- Displays weather and reminders  
- Reacts to motion  

### Desktop Application (PeekApp)
- Allows users to view environmental data  
- Manage reminders  
- Configure location settings  
- Receive notifications  

Communication between the mirror and the application happens via an MQTT broker, enabling real-time updates in both directions.

### Key Features

- Live temperature and humidity monitoring  
- Bathroom occupancy detection  
- Weather forecasts via external API  
- User-created reminders displayed on the mirror  
- Motion-controlled lighting and display activation  
- Notifications when humidity reaches mold-risk levels  

---

## My Contributions

My main contributions included:

- Hardware setup and integration (Wio Terminal, temperature & humidity sensor, motion sensor, LED strip)
- Motion detection logic controlling lighting and mirror activation
- Publishing motion and sensor data to the desktop application via MQTT
- User interface and logic for bathroom occupancy status
- Reminder display logic on the mirror
- Desktop application UI foundations
- MQTT subscription handling on the application side
- Environmental notifications (temperature & humidity alerts)
- Physical assembly of the prototype
- Project documentation and demo video

This work involved both embedded programming and desktop application development, with responsibility spanning hardware integration, communication logic, and user-facing features.

---

## Team

- Rebecka Åkerblom  
- Ibrahim Alzouby  
- Jawad Ahmad  
- Carl-Johan Ericsson  
- Setareh Goldchin Jouposhti  

---

## Project Focus

Peekaboo demonstrates:

- End-to-end IoT system design  
- MQTT-based real-time communication  
- Embedded programming with Arduino  
- Desktop UI development  
- Sensor integration  
- Hardware–software co-design  
- User-centric product thinking  
