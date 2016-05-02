# Transplant-Trolley
Simulation about the Judith Jarvis Thompson version of the Trolley Problem

I always thought the Trolley problem was super interesting, so I decided to make a simulation about it!

Goals:
	Build simulations outlining the different complexities of the Transplant Trolley problem.
	Test solutions to the Transplant Trolley Problem.
 	Simulate people aging and developing organ failure.
 		Use gross statistics to accurately determine whether someone develops organ failure.
 		Use gross statistics to accurately determine life spans of people with/without organ failure
 	Do this all in Clojure because I'm crazy.

Summary: 
	A trolley is rolling on a track which splits into two tracks. On one track there lies one person. On the other there are three. The trolley is heading for the three,
	is it better to keep it on its track because they are going to die, or do you change the track so the one dies instead and vice versa.

	Basically, the Trolley problem is the moral argument of whether sacrificing one life to save multiple others is okay or not.

	I look to test different solutions to the transplant version of this problem where one living person would be sacrificed as a donor for multiple other people needing 
	one or more organ transplants. Variations include things like "number of organs needed for someone to be sacrificed", "number of organs failing before taking them off the transplant list", 
	"do we sacrifice people with failing organs?".

Wikipedia Article: https://en.wikipedia.org/wiki/Trolley_problem#Transplant

This work is meant to be used as a tool for academic discussion, but is in no way limited to that purpose.
This code is completely unlicensed, so please edit or copy it for any purpose you wish.
If you use this code for any reason, I'd love to hear what you used it for and how it went!
Cheers!

Daron Schmit

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

I posted this to reddit, I'm keeping it here in case I have to copy/paste

Short Version:

Does anyone know statistics or where to find statistics concerning the following:

 - developing organ failure in a general population
 - life span of organ failure patients
 - what organs a person can donate and still live
 - what organs a person can't live without
 - odds of developing organ failure over time

---------------------------

Long Version:

I'm attempting to build a simulation to test solutions to the Transplant version of the [Trolley Problem](https://en.wikipedia.org/wiki/Trolley_problem#Transplant).
Specifically, I'm building a population of people that age and have a chance at developing organ failure and I need statistics so my simulation represents the real world as closely as possible. The simulation generates an aging population of people whose organs occasionally fail, and when multiple people have failing organs, a healthy person is used as a donor to save those who are sick. I plan on building more complex algorithms for who is chosen as a donor so that I can compare and contrast methods. 

I'm starting with building a static population where x have organ failure which is based on gross probability (ex: one in n people suffer from heart failure). Eventually, I will build an aging population where people develop these issues, and live and die accordingly. For that, I'll need time-sensitive statistics (ex: as you age, your risk of liver failure goes up by/to x%).

This is a passion project, but I may use it at some point as part of a "portfolio" of some sort and I plan on allowing anyone to use the source for whatever reason.

If anyone is interested in helping in any way, let me know via PM or comment!

[Github Link](https://github.com/DaronSchmit/Transplant-Trolley.git) for the curious. 

Yes, I'm using Clojure, which is a functional language, because using Object-Oriented programming is overrated, although I may rewrite it in Java, Python, or some other Object-Oriented language in the future.
